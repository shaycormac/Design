package com.assassin.design.singleton;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/17 13:43
 * @Version: 1.0
 * @Description: 最简单最粗暴的单例模式，序列化，线程安全，延迟加载统统不考虑
 */

enum SingletonEnum 
{
    INSATNCE;

    SingletonEnum() 
    {
    }
    
    //对外暴露方法
    public void dosomeThing() {
        System.out.println("这是我的单例具体方法");
    }
}
