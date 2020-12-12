package com.origami.haloblog.utils;

import com.origami.haloblog.exception.BeanUtilsException;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.beans.PropertyDescriptor;
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

}
