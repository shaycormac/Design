package com.assassin.design.flyWeight;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:33
 * @Version: 1.0
 * @Description: 享元模式 
 *  单纯享元模式和创建型的简单工厂模式实现上非常相似，但是它的重点或者用意却和工厂模式截然不同。工厂模式的使用主要是为了使系统不依赖于实现得细节；
 *  而在享元模式的主要目的是避免大量拥有相同内容对象的开销。
 *  
 *  区分外部状态和内部状态
 */
//抽象享元角色类
interface ICustomString 
{
    //外部状态以参数的形式通过此方法传入
    void opt(String state);
}
