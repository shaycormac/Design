package com.assassin.design.observer.pullObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:50
 * @Version:
 * @Description:
 */

class MessagePullSubject extends PullSubject
{
    private String message;
    public String getState()
    {
        return message;
    }

   public void netChanged(String message)
   {
       this.message = message;
       notifyDateChanged();
   }
}
