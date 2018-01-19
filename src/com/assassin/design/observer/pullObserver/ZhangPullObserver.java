package com.assassin.design.observer.pullObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:49
 * @Version:
 * @Description:
 */

class ZhangPullObserver implements PullObserver {
    @Override
    public void update(PullSubject pullSubject) 
    {
        //得到这个实体，自己怎么玩就看自己的了
        MessagePullSubject subject = (MessagePullSubject) pullSubject;
        System.out.println("张三去主动拉："+subject.getState());
    }
}
