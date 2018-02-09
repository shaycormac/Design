package com.assassin.design.compositePattern.safeComposite;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 14:02
 * @Version:
 * @Description:安全组合模式，弊端是在客户端main函数中直接使用了SafeComposite的实现类，与依赖倒置原则相违背，
 * 即我们定义的接口相当于不起作用，既然是面向接口编程，那么就要更多焦点放在接口设计上，
 * 即所谓的透明组合模式，把所有的抽象方法都汇集到顶层，其中叶子节点把实现集合的方法抛异常，支干则实现即可，即透明组合模式
 */

class SafeCompositeMain
{
    public static void main(String[] args) {
        //跟节点
        SafeContainerComposite root = new SafeContainerComposite("我是跟节点");
        SafeContainerComposite branchA = new SafeContainerComposite("我是左枝干");
        SafeContainerComposite branchB = new SafeContainerComposite("我是右枝干");
        SafeLeafComposite leafA = new SafeLeafComposite("我是左叶子");
        SafeLeafComposite leafB = new SafeLeafComposite("我是右叶子");
        root.addSafeComposite(branchA);
        root.addSafeComposite(branchB);
        branchA.addSafeComposite(leafA);
        branchA.addSafeComposite(leafB);
        root.doSomething();
    }
}
