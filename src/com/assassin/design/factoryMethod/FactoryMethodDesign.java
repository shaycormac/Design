package com.assassin.design.factoryMethod;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 14:14
 * @Version:
 * @Description:
 */

class FactoryMethodDesign
{
    public static void main(String[] args) 
    {
        //首先创建一个对应的工厂
        DogFactory dogFactory = new DogFactory();
        //生产相应的动物
        Animal dog = dogFactory.createAnimal();
        dog.jump();
        //同理猫咪
        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.jump();
    }
}
