package com.ran.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 * Created By nature on 2018/6/15
 */
public class Handler {
    /**
     * controller类
     */
    private Class<?> controllerClass;
    /**
     * action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public void setControllerClass(Class<?> controllerClass) {
        this.controllerClass = controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(Method actionMethod) {
        this.actionMethod = actionMethod;
    }

}
