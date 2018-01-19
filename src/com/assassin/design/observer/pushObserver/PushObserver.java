package com.assassin.design.observer.pushObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 10:53
 * @Version: 1.0
 * @Description: 抽象的观察者,定义了一个更新能力的行为
 * 
 * 推方式的观察察者模式实例：

  主题对象向观察者推送主题的详细信息，不管观察者是否需要，推送的信息通常是主题对象的全部或部分数据。
 
 */

interface PushObserver 
{
    void update(String information);
}
