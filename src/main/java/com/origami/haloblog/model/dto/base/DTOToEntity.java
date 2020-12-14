package com.origami.haloblog.model.dto.base;

import com.origami.haloblog.exception.BeanUtilsException;
import com.origami.haloblog.utils.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/**
 * @author origami1203
 * @date 2020-12-11 15:52
 * @description 将entity转换为dto
 */
public interface DTOToEntity<T> {

    /**
     *  将制定类型转换为T类型entity
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
        return BeanUtils.getParameterizedType(DTOToEntity.class, this.getClass());
    }


    /**
     * 将制定类型转换为T类型entity
     * @param entity 要转换成的类型
     */
    default void update(T entity) {
        BeanUtils.updateProperties(this, entity);
    };
}
