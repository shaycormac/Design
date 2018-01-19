package com.assassin.design.observer.pushObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 11:02
 * @Version:
 * @Description:
 */

class PushObserverMain
{
    public static void main(String[] args) {
        NewsPushSubject subject = new NewsPushSubject();
        PushObserver pushObserver = new LiSiPushObserver();
        PushObserver pushObserver2 = new ZhangSanPushObserver();
        subject.attach(pushObserver);
        subject.attach(pushObserver2);
        subject.netWorng("网断了！！");
        subject.netWorng("网又恢复了！！");
    }
}
