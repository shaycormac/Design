package com.assassin.design.decoratorPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/25 10:04
 * @Version:
 * @Description:
 */

class DecorateMain
{
    public static void main(String[] args) {
        //有一个Android程序猿只会写Android代码
        ProgramMonkey monkey = new AndroidProgramMonkey();
        monkey.skill();
        //装饰一下他，装逼的技能，他竟然除了写Android还懂设计模式
        DecorateProgramMonkey decorateProgramMonkey = new DecorateProgramMonkey(monkey);
        decorateProgramMonkey.skill();
    }
}
