package com.assassin.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 10:01
 * @Version: 1.0
 * @Description: 动态代理，实现接口即可。
 */

class DynamicProxyHandler implements InvocationHandler {
    //被代理的类引用（使用一个共同的基类）
    private Object object;

    
    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法。
        Object result = method.invoke(object, args);
        return result;
    }
}
