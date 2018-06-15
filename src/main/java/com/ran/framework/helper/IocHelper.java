package com.ran.framework.helper;

import com.ran.framework.annotation.Inject;
import com.ran.framework.util.ReflectionUtil;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 依赖注入助手类
 * Created By nature on 2018/6/14
 */
public class IocHelper {

    static {
        // 获取所有bean类与bean类实例之间的映射关系
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if(!beanMap.isEmpty()) {
            // 遍历beanMap
            for(Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                // 从beanMap中获取bean类与bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取bean类定义的所有成员变量（简称bean field）
                Field[] beanFields = beanClass.getDeclaredFields();
                if(ArrayUtils.isNotEmpty(beanFields)) {
                    // 遍历beanField
                    for(Field beanField : beanFields) {
                        // 判断当前beanField是否带有Inject注解
                        if(beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null) {
                                // 通过反射初始化beanField值
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
