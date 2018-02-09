package com.assassin.design.protoType;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:12
 * @Version:
 * @Description:
 */

class ProtoMain
{
    public static void main(String[] args) 
    {
        //先创建一个对象
        ConcreteMonkey monkey = new ConcreteMonkey();
        monkey.printHasCode();
        for (int i = 0; i < 5; i++) {
            try {
                //克隆出来的对象。在内存层直接复制的对象
                ConcreteMonkey cloneObject = (ConcreteMonkey) monkey.clone();
                cloneObject.printHasCode();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
