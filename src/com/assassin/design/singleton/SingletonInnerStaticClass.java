package com.assassin.design.singleton;

import java.io.Serializable;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/17 13:45
 * @Version:
 * @Description: 静态内部类的单例,防止序列化生成2个对象的话，需要实现setijie
 */

class SingletonInnerStaticClass implements Serializable {
    
    private SingletonInnerStaticClass() {
    }
    
    private  static class Holder
    {
        private static final  SingletonInnerStaticClass INSTANCE = new SingletonInnerStaticClass();
    }
    
    
    public static final SingletonInnerStaticClass getInstance()
    {
        return Holder.INSTANCE;
    }

    /**
     *这是你想要做的事情。
     */
    public void doSomthing()
    {
        
    }


    /**
     * 如果序列化，需要加入此方法，否则单例模式无效
     * @see java.io.ObjectStreamClass
     * @return
     */

    private Object readResolve() {
        return Holder.INSTANCE;
    }
}
