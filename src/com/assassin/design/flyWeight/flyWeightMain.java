package com.assassin.design.flyWeight;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:42
 * @Version: 1.0
 * @Description:  所以，要区分内部和外部这两个东东
 */

class flyWeightMain
{
    public static void main(String[] args) {
        //先创建一个工厂
        CustomStringFactory factory = new CustomStringFactory();
        ICustomString customString = factory.product('a');
        customString.opt("ShayCormac");

        customString = factory.product('b');
        customString.opt("ezio");

        customString = factory.product('a');
        customString.opt("ratonhagaytoon");
        
    }
}
