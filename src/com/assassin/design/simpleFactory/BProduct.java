package com.assassin.design.simpleFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 13:57
 * @Version:
 * @Description:
 */

class BProduct implements Product {
    @Override
    public void surface() {
        System.out.println("B产品的外观是坦克");
    }
}
