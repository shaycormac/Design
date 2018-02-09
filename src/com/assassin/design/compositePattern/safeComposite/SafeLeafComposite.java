package com.assassin.design.compositePattern.safeComposite;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 14:01
 * @Version:
 * @Description:
 */

class SafeLeafComposite extends SafeComposite 
{
    public SafeLeafComposite(String name) {
        super(name);
    }

    @Override
    void doSomething() 
    {
        System.out.println(name);    
    }
}
