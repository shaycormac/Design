package com.assassin.design.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 10:04
 * @Version:
 * @Description:
 */

class dynamicProxyMain
{
    public static void main(String[] args) {
        //创造一个具体的对象，小明，左边的引用使用接口
        ILawsuit xiaoming = new XiaoMin();
        //构造一个动态代理Handler
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(xiaoming);
        //获取小明的类加载器
        ClassLoader classLoader = xiaoming.getClass().getClassLoader();
        //动态构造一个律师对象 ，静态方法有三个参数 ，第一个是实现类加载器，第二个是共同的接口数组，第三个是handler,然后还要强转。
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxyHandler);
        //执行相关的代理
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
