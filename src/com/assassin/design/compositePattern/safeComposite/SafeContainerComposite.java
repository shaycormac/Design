package com.assassin.design.compositePattern.safeComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/2/9 13:52
 * @Version: 1.0
 * @Description: 具体枝干节点
 */

 class SafeContainerComposite extends SafeComposite 
{

    private List<SafeComposite> compositeList;
    public SafeContainerComposite(String name) {
        super(name);
        compositeList = new ArrayList<>();
    }

    @Override
    void doSomething() 
    {
        System.out.println(name);
        if(!compositeList.isEmpty())
        {
            int length = compositeList.size();
            SafeComposite safeComposite;
            for (int i = 0; i < length; i++)
            {
                safeComposite = compositeList.get(i);
                safeComposite.doSomething();
            }
        }
        
    }

    public void addSafeComposite(SafeComposite composite)
    {
        compositeList.add(composite);
    }
    
    public void removeSafeComposite(SafeComposite composite)
    {
        compositeList.remove(composite);
    }
    
    public SafeComposite getSafeComposite(int index)
    {
        return compositeList.get(index);
    }
}
