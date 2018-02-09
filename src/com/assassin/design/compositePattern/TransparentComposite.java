package com.assassin.design.compositePattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 10:30
 * @Version:
 * @Description:
 */

class TransparentComposite
{
    public static void main(String[] args) {
        //创建跟节点
        Component root = new ContainerComposite("跟节点");
        //创建一个容器
        Component containerA = new ContainerComposite("容器A");
        Component containerB = new ContainerComposite("容器b");
        Component leafA = new LeafComposite("叶子节点A");
        Component leafB = new LeafComposite("叶子节点B");
        root.addChild(containerA);
        root.addChild(containerB);
        containerA.addChild(leafA);
        containerA.addChild(leafB);
        root.doSomething();
    }
}
