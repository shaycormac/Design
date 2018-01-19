package com.assassin.design.observer.systemObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 14:20
 * @Version:
 * @Description:
 */

class SystemObserverMain
{
    public static void main(String[] args) {
        MessageObservable observable = new MessageObservable();
        LiObserver liObserver = new LiObserver(observable);
        ZhangObserver zhangObserver = new ZhangObserver(observable);
        observable.netChanged("要断网啦");
    }
}
