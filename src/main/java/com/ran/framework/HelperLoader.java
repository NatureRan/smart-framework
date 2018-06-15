package com.ran.framework;

import com.ran.framework.helper.BeanHelper;
import com.ran.framework.helper.ClassHelper;
import com.ran.framework.helper.ControllerHelper;
import com.ran.framework.helper.IocHelper;
import com.ran.framework.util.ClassUtil;

/**
 * 加载相应的helper类
 * Created By nature on 2018/6/15
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for(Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
