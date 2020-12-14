package com.origami.haloblog.utils;

import com.origami.haloblog.exception.BeanUtilsException;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.beans.PropertyDescriptor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/**
 * @author origami1203
 * @date 2020-12-11 19:35
 * @description 工具类
 */
public class BeanUtils {

    private BeanUtils() {
    }

    /**
     * 将源对象转换为目标类型
     * @param source 源对象
     * @param targetClass 目标类的class
     * @param <T> 目标类型的实例
     * @return 目标类型的实例
     */
    public static <T> T transform(@Nullable Object source, @Nullable Class<T> targetClass) {
        Assert.notNull(targetClass,"Target class must not be null");
        if (source == null) {
            return null;
        }

        try {
            T targetInstance = targetClass.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(source, targetInstance,
                                                               getEmptyPropertyNames(source));
            return targetInstance;
        } catch (Exception e) {
            throw new BeanUtilsException("BeanUtils转换出错");
        }
    }

    /**
     * 获取对象的属性值为空的属性的数组
     * @param source 源对象
     * @return 空值的属性的数组
     */
    private static String[] getEmptyPropertyNames(@Nullable Object source) {
        Assert.notNull(source, "source can not be null");
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(source);

        Set<String> emptyProperties = new HashSet<>();

        PropertyDescriptor[] propertyDescriptors = beanWrapper.getPropertyDescriptors();

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String propertyName = propertyDescriptor.getName();
            Object propertyValue = beanWrapper.getPropertyValue(propertyName);

            if (propertyValue == null) {
                emptyProperties.add(propertyName);
            }
        }

        return emptyProperties.toArray(new String[0]);
    }

    public static void updateProperties(@NonNull Object source, @NonNull Object target) {
        Assert.notNull(source, "source object must not be null");
        Assert.notNull(target, "target object must not be null");

        // Set non null properties from source properties to target properties
        try {
            org.springframework.beans.BeanUtils.copyProperties(source, target,
                                                               getEmptyPropertyNames(source));
        } catch (BeansException e) {
            throw new BeanUtilsException("Failed to copy properties", e);
        }
    }

    /**
     * 查看指定类是否实现了指定的接口或实现了指定类,若存在,获取该接口的参数化类型(主要用于获取泛型类型)
     * @param implementClass 是否实现的类
     * @param targetClass 目标类
     * @return 指定的参数化类型
     */
    public static ParameterizedType getParameterizedType(Class<?> implementClass,
                                                         Class<?> targetClass) {

        ParameterizedType currentType = null;

        // 获取该类上的所有接口
        Type[] interfaces = targetClass.getGenericInterfaces();

        for (Type anInterface : interfaces) {
            if (anInterface instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) anInterface;
                // 若该类实现了EntityToDTO接口,返回该EntityToDTO接口
                if ( parameterizedType
                        .getRawType()
                        .getTypeName()
                        .equals(implementClass.getTypeName())) {
                    currentType = parameterizedType;
                    break;
                }
            }
        }

        return currentType;
    }

}
