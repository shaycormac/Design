package com.assassin.design.protoType;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:13
 * @Version:
 * @Description:  原型模式实现类
 */

class ConcreteMonkey extends MonkeyProgrammer
{
    public void printHasCode() {
        System.out.println("ConcreteMonkeyPrototype hascode="+this.hashCode());
    }
}
