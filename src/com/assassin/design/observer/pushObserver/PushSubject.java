package com.assassin.design.observer.pushObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 10:57
 * @Version:
 * @Description:
 */

abstract class PushSubject 
{
    private List<PushObserver> list = new ArrayList<>();
    
    public void attach(PushObserver pushObserver)
    {
        list.add(pushObserver);
    }
    
    public void detach(PushObserver pushObserver)
    {
        list.remove(pushObserver);
    }
    
    public void notifyDataChanged(String updateInfomation)
    {
        int length = list.size();
        PushObserver pushObserver;
        for (int i = 0; i < length; i++) {
            pushObserver = list.get(i);
            pushObserver.update(updateInfomation);
        }
    }
}
