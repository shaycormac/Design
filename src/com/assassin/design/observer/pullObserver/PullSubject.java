package com.assassin.design.observer.pullObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:45
 * @Version:
 * @Description:
 */

abstract  class PullSubject 
{
    private List<PullObserver> list = new ArrayList<>();
    
    public void attach(PullObserver observer)
    {
        list.add(observer);
    }
    
    public void detach(PullObserver observer)
    {
        list.remove(observer);
    }
    
    //更新消息
    
    public void notifyDateChanged()
    {
        for (PullObserver pullObserver : list) {

            pullObserver.update(this);
        }
    }
}
