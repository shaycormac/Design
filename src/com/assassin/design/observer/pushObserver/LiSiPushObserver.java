package com.assassin.design.observer.pushObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 10:56
 * @Version:
 * @Description:
 */

class LiSiPushObserver implements PushObserver {
    @Override
    public void update(String information) {
        System.out.println("李四收到了更新消息： "+ information);
    }
}
