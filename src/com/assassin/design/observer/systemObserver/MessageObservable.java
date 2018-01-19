package com.assassin.design.observer.systemObserver;

import java.util.Observable;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 14:15
 * @Version:
 * @Description:
 */

class MessageObservable extends Observable 
{
    private String status;

    public String getStatus() 
    {
        return status;
    }

    public void netChanged(String message)
    {
        this.status = message;
        setChanged();
        notifyObservers();
        
    }
}
