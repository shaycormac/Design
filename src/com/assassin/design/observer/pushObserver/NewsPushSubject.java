package com.assassin.design.observer.pushObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 11:01
 * @Version:
 * @Description:
 */

class NewsPushSubject extends PushSubject
{
    public void netWorng(String message)
    {
        notifyDataChanged(message);
    }
}
