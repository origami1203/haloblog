package com.origami.haloblog.model.dto.base;

import com.origami.haloblog.utils.BeanUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/**
 * @author origami1203
 * @date 2020-12-11 15:52
 * @description 将entity转换为dto
 */
public interface EntityToDTO<T> {

    /**
     *  将指定entity转换为dto
     * @return 该实体的dto对象
     */
    @SuppressWarnings("unchecked")
    default T convertTo() {

        ParameterizedType parameterizedType = getParameterizedType();

        Objects.requireNonNull(parameterizedType, "该类没有实现EntityToDTO接口");

        Class<T> entity = (Class<T>) parameterizedType.getActualTypeArguments()[0];

        return BeanUtils.transform(this, entity);

    }

    /**
     * 查看该类是否实现了EntityToDTO的接口,若存在,获取该接口的参数话类型
     * @return 符合要求的Type
     */
    default ParameterizedType getParameterizedType() {

        ParameterizedType currentType = null;

        // 获取该类上的所有接口
        Type[] interfaces = this.getClass().getGenericInterfaces();

        for (Type anInterface : interfaces) {
            if (anInterface instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) anInterface;
                // 若该类实现了EntityToDTO接口,返回该EntityToDTO接口
                if ( parameterizedType
                        .getRawType()
                        .getTypeName()
                        .equals(EntityToDTO.class.getTypeName())) {
                    currentType = parameterizedType;
                    break;
                }
            }
        }

        return currentType;
    }
}
