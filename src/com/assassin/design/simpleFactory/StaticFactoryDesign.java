package com.assassin.design.simpleFactory;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/16 14:01
 * @Version: 1.0
 * @Description: 简单工厂，也叫静态工厂，由一个工厂类来创建具有相同父类的类
 * <p>
 * 小结
 * <p>
 * 简单工厂优点
 * <p>
 * 工厂类有必要的逻辑判断，可以决定具体创建类，使用者免除直接创建对象的责任。
 * 简单工厂缺点
 * <p>
 * 使用多重判断，比较难维护。
 * 每增加一个英雄，都要在工厂类中增加相应的创建业务的逻辑方法，违背开闭原则。
 */

class StaticFactoryDesign {
    public static void main(String[] args) {
        Product aProduct = SimpleFactory.createProductByName(SimpleFactory.PRODUCT_A);
        aProduct.surface();
        Product bProduct = SimpleFactory.createProductByName(SimpleFactory.PRODUCT_B);
        bProduct.surface();
    }
}
