package com.assassin.design.proxy;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 09:43
 * @Version: 1.0
 * @Description: 代理模式，先定义一个接口或者抽象类，让代理和真正的对象都实现它，而代理持有实际的对象，在操作方式一样的
 * 情况下，代理真正的对象
 * 以小明打官司为例子，
 */

interface ILawsuit {
    //提交诉讼
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();
    //诉讼完成
    void finish();
}
