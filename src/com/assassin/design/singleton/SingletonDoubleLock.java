package com.assassin.design.singleton;

import java.io.Serializable;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/17 13:55
 * @Version: 1.0
 * @Description: 普通双重锁校验 为了防止序列化生成不同对象，需要实现ser
 */

class SingletonDoubleLock implements Serializable
{
    //这个必须加上
    private static volatile SingletonDoubleLock instance;

    private SingletonDoubleLock() 
    {
    }
    
    public static SingletonDoubleLock getInstance()
    {
        if (instance == null) {
            synchronized (SingletonDoubleLock.class)
            {
                if (instance == null) {
                    instance = new SingletonDoubleLock();
                }
                
            }
        }
        return instance;
    }

    public void doSomething()
    {
    }

    /**
     * 如果序列化，需要加入此方法，否则单例模式无效
     * @see java.io.ObjectStreamClass
     * @return
     */

    private Object readResolve() {
        return instance;
    }
}
