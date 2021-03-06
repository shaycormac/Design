package com.assassin.design.abstractFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 15:39
 * @Version:
 * @Description:
 */

class LGFactory implements PhoneFactory {
    @Override
    public Phone create() 
    {
        return new Android();
    }

    @Override
    public OS baseOnLanguage() {
        return new AndroidOS();
    }
}
