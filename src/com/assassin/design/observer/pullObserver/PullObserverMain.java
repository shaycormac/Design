package com.assassin.design.observer.pullObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:55
 * @Version:
 * @Description:
 */

class PullObserverMain
{
    public static void main(String[] args) {
        MessagePullSubject subject = new MessagePullSubject();
        PullObserver liPullObserver = new LiPullObserver();
        PullObserver zhangPullObserver = new ZhangPullObserver();
        subject.attach(liPullObserver);
        subject.attach(zhangPullObserver);
        subject.netChanged("要断网了啊");
        subject.netChanged("有网了啊");
        
    }
}
