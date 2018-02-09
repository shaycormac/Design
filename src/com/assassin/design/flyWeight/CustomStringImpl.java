package com.assassin.design.flyWeight;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:35
 * @Version:
 * @Description: //具体享元角色类
 */

class CustomStringImpl implements ICustomString 
{
    //负责为内部状态提供存储空间
    private Character mInnerState = null;

    public CustomStringImpl(Character mInnerState) {
        this.mInnerState = mInnerState;
    }

    @Override
    public void opt(String state) 
    {
        System.out.println("Inner state = "+this.mInnerState);
        System.out.println("Out state = "+state);
    }
}
