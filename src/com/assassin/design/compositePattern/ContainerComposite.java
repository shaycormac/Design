package com.assassin.design.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 10:25
 * @Version:
 * @Description:
 */

class ContainerComposite extends Component
{
    //需要一个集合来承载
    protected List<Component> childList;
    
    public ContainerComposite(String userName) 
    {
        super(userName);
        childList = new ArrayList<>();
    }

    @Override
    void doSomething() 
    {
        System.out.println(userName);
        if (!childList.isEmpty())
        {
            int length = childList.size();
            //遍历子类，进行递归
            Component component;
            for (int i = 0; i < length; i++)
            {
                component = childList.get(i);
                component.doSomething();
            }
        }
        
        
    }

    @Override
    void addChild(Component component) 
    {
        childList.add(component);
    }

    @Override
    void removeChild(Component component) 
    {
       if (childList.contains(component))
       {
           childList.remove(component);
       }
           
    }

    @Override
    Component getChild(int index) 
    {
        return childList.get(index);
    }
}
