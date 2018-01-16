package com.assassin.design.factoryMethod;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 14:11
 * @Version:
 * @Description:
 */

class Dog implements Animal {
    @Override
    public void jump() {
        System.out.println("狗可以咬人");
    }
}
