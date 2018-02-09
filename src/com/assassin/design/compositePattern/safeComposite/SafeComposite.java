package com.assassin.design.compositePattern.safeComposite;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 10:38
 * @Version:
 * @Description: 安全模式的组合模式，并非把所有的抽象方法写到底层抽象类中，而是容器中有抽象方法。
 */

abstract class SafeComposite 
{
    protected String name;

    public SafeComposite(String name) 
    {
        this.name = name;
    }

    abstract void doSomething();
}
