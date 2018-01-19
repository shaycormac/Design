package com.assassin.design.observer.systemObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 14:08
 * @Version:
 * @Description:
 */

class ZhangObserver implements Observer 
{
    public ZhangObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) 
    {
        MessageObservable observable = (MessageObservable) o;
        System.out.println("张三的"+observable.getStatus());
    }
}
