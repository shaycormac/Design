package com.assassin.design.proxy;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 09:46
 * @Version: 1.0
 * @Description: 小明要去打官司，需要实现打官司的接口
 */

class XiaoMin implements ILawsuit{
    @Override
    public void submit() {
        System.out.println("老板拖欠工资，特此申请仲裁");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿，不需要再说什么了");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功，判决老板抓紧还钱，MMP。");
    }
}
