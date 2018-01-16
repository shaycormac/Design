package com.assassin.design.abstractFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 14:27
 * @Version:
 * @Description:
 */

class Ios implements Phone
{
    @Override
    public void belongCompany() {
        System.out.println("属于苹果公司");
    }
}
