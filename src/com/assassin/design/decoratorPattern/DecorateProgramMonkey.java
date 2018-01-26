package com.assassin.design.decoratorPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/25 10:02
 * @Version:
 * @Description:
 */

class DecorateProgramMonkey implements ProgramMonkey 
{
    ProgramMonkey programMonkey;

    public DecorateProgramMonkey(ProgramMonkey programMonkey) {
        this.programMonkey = programMonkey;
    }

    @Override
    public void skill() 
    {
        this.programMonkey.skill();
        System.out.println("这家伙经过被装饰，也会写其他的代码了");
    }
}
