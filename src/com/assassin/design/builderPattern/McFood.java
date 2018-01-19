package com.assassin.design.builderPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 09:44
 * @Version: 1.0
 * @Description: 建造者模式，以麦当劳卖东西为例
 */

class McFood 
{
    private int totalCount;//份数
    private boolean addIce;     //饮料是否去冰
    private Hamburg hamburg;    //汉堡包
    private Drink drink;        //饮品
    private String remark;      //备注
    private boolean takeOut;//是否外带

    private McFood() 
    {
    }
    
    public McFood(Builder builder)
    {
        this.totalCount = builder.totalCount;
        this.addIce = builder.addIce;
        this.hamburg = builder.hamburg;
        this.drink = builder.drink;
        this.remark = builder.remark;
        this.takeOut = builder.takeOut;
    }

    public static class Hamburg {
        public static final String HAMBURG_CHICKEN = "chicken";
        public static final String HAMBURG_BEEF = "beef";
        private String hamburgName;

        public Hamburg(String hamburgName) {
            this.hamburgName = hamburgName;
        }

        public String getHamburgName() {
            return hamburgName;
        }
    }

    public static class Drink 
    {//饮品类
        public static final String DRINK_COLA = "cola";
        public static final String DRINK_SPRITE = "sprite";
        private String drinkName;

        public Drink(String drinkName) {
            this.drinkName = drinkName;
        }
        
        public String getDrinkName()
        {
            return drinkName;
        }
    }
    //一般使用静态内部类引入Builder
    
    public static class Builder
    {
        //和主类的属性一模一样
        private int totalCount = 0;
        private boolean addIce = false;
        private Hamburg hamburg = null;
        private Drink drink = null;
        private String remark = null;
        private boolean takeOut = false;
        
        //设置Builder，返回自己
        public Builder setTotalCount(int totalCount)
        {
            this.totalCount = totalCount;
            return this;
        }

        public Builder addIce(boolean addIce) {
            this.addIce = addIce;
            return this;
        }

        public Builder hamburg(Hamburg hamburg) {
            this.hamburg = hamburg;
            return this;
        }

        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder takeOut(boolean takeOut) {
            this.takeOut = takeOut;
            return this;
        }
        
        
        public McFood create()
        {
            return new McFood(this);
        }
        
        
    }
    
    
    //测试一下
    public static void main(String[] args) {
        McFood.Builder builder = new Builder();
    }

}
