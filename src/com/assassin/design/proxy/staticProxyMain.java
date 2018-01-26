package com.assassin.design.proxy;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 09:52
 * @Version:
 * @Description:
 */

class staticProxyMain
{
    public static void main(String[] args) {
        //有个小明的对象
        ILawsuit xiaoMin = new XiaoMin();
        //律师代理小明
        Lawyer lawyer = new Lawyer(xiaoMin);
        //真正的对象就是简单的生成一下，其他的均不用管了
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
