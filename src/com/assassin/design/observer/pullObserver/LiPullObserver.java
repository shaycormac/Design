package com.assassin.design.observer.pullObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:50
 * @Version:
 * @Description:
 */

class LiPullObserver implements PullObserver {
    @Override
    public void update(PullSubject pullSubject) 
    {
        MessagePullSubject subject = (MessagePullSubject) pullSubject;
        System.out.println("李四去主动拉："+subject.getState());
        
    }
}
