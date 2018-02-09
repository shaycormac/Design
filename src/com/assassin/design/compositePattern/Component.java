package com.assassin.design.compositePattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 10:17
 * @Version: 1.0
 * @Description: 透明的组合模式，该模式让叶子节点和父容器外表特征几乎一样，符合面向接口编程概念，子类实现的时候，
 * 需要把容器的增删改查的抛出异常
 */

public abstract class Component 
{
    protected String userName;
  //构造方法可以做的文章实际上很多，初始化参数，传入一些对象进来
    public Component(String userName) {
        this.userName = userName;
    }

    abstract void doSomething();
    
    abstract void addChild(Component component);

    abstract void removeChild(Component component);

    abstract Component getChild(int index);
    
}
