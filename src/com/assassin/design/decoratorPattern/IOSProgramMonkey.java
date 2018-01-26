package com.assassin.design.decoratorPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/25 10:01
 * @Version:
 * @Description:
 */

class IOSProgramMonkey implements ProgramMonkey {
    @Override
    public void skill() {
        System.out.println("会写IOS的程序员");
    }
}
