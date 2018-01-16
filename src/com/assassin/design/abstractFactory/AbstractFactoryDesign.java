package com.assassin.design.abstractFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 15:41
 * @Version:
 * @Description:
 */

class AbstractFactoryDesign
{
    public static void main(String[] args)
    {
        AppleFactory appleFactory = new AppleFactory();
        Phone apple = appleFactory.create();
        OS appleOS = appleFactory.baseOnLanguage();
        apple.belongCompany();
        appleOS.osName();
        
        //android
        LGFactory lgFactory = new LGFactory();
        Phone lg = lgFactory.create();
        OS lgOS = lgFactory.baseOnLanguage();
        lg.belongCompany();
        lgOS.osName();
    }
}
