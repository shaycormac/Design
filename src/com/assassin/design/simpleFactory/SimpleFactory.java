package com.assassin.design.simpleFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 13:58
 * @Version:
 * @Description:
 */

class SimpleFactory
{
    public static final String PRODUCT_A = "PRODUCT_A";
    public static final String PRODUCT_B = "PRODUCT_B";
    public static Product createProductByName(String name)
    {
        switch(name){
            case PRODUCT_A:
                
                return new AProduct();
            case PRODUCT_B:  
                return new BProduct();
            default:
                break;
        }
        return null;
    }
}
