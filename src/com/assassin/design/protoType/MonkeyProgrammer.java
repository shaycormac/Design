package com.assassin.design.protoType;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 09:43
 * @Version: 1.0
 * @Description: 克隆（原型）模式（创建性模式）
 * 注意事项： 使用原型模式复制对象不会调用类的构造方法 
 * 因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，因此不会调用到类的构造方法。不但构造方法中的代码不会执行，
 * 甚至连访问权限都对原型模式无效。还记得单例模式吗？单例模式中，只要将构造方法的访问权限设置为private型，就可以实现单例。
 * 但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意。
 *  
 */

abstract class MonkeyProgrammer implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        //通过clone方法生产的对象。
        MonkeyProgrammer monkeyProgrammer = (MonkeyProgrammer) super.clone();
        return monkeyProgrammer;
    }
}
