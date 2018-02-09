package com.assassin.design.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/29 10:38
 * @Version:
 * @Description:
 * 
 * //享元工厂角色类
//一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式
 */

class CustomStringFactory 
{
    private Map<Character, ICustomString> map = new HashMap<>(); 
    
    public ICustomString  product(Character character)
    {
        ICustomString cacheTemp = map.get(character);
        if (cacheTemp==null)
        {
            cacheTemp = new CustomStringImpl(character);
            //储存起来
            map.put(character, cacheTemp);
        }

        return cacheTemp;
    }
    
    
    
}
