package com.assassin.design.builderPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 09:57
 * @Version:
 * @Description:
 */

class McFoodTest
{
    public static void main(String[] args) {
        McFood.Builder builder = new McFood.Builder();
        builder.setTotalCount(3)
                .addIce(false)
                .drink(new McFood.Drink(McFood.Drink.DRINK_COLA))
                .create();
    }
}
