package com.assassin.design.simpleFactory;

/**
 * Created by n0033585 on 2018/1/16.
 * 静态工厂，简单工厂模式，产品是一个带有抽象方法的接口，然后工厂静态方法输出这个对象，根据传入的不同产品名称
 */
public interface Product
{
    void surface();
}
