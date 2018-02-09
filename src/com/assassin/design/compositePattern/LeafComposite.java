package com.assassin.design.compositePattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 10:23
 * @Version:
 * @Description:
 */

class LeafComposite extends Component 
{
    public LeafComposite(String userName) {
        super(userName);
    }

    @Override
    void doSomething() 
    {
        System.out.println(userName);
        
    }

    @Override
    void addChild(Component component) {
        throw new RuntimeException("没有子节点啦");
    }

    @Override
    void removeChild(Component component) 
    {
        throw new RuntimeException("没有子节点啦");

    }

    @Override
    Component getChild(int index) 
    {
        throw new RuntimeException("没有子节点啦");
    }
}
