package com.stark.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object object;

    private SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return java.lang.reflect.Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new SecurityProxy(object));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            if(method.getName().contains("post")) {
                throw new IllegalAccessException("Post are currently not allowed");
            }
            else {
                result = method.invoke(object, args);
            }
        } catch (InvocationTargetException e) {
            e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }

        return result;
    }
}
