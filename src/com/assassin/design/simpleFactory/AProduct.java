package com.assassin.design.simpleFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 13:55
 * @Version:
 * @Description:
 */

class AProduct implements Product {
    @Override
    public void surface() {
        System.out.println("A产品的外观是飞机");
    }
}
