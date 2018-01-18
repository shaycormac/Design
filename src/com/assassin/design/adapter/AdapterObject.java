package com.assassin.design.adapter;

/**
 * Created by ShayPatrickCormac on 2018/1/18.
 * 概念： 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。

 分类：根据适配器类与适配者类的关系不同，适配器模式可分为对象适配器和类适配器两种。在对象适配器模式中，适配器与适配者之间是关联关系；
    在类适配器模式中，适配器与适配者之间是继承（或实现）关系。
 */


/**
 * 对象适配器模式 的代码实例：

 该例假设了原来有一个程序猿MonkeyAndroidAdaptee精通（只会）Android开发，后来有一天这个程序猿走了，写的代码还在，公司重新招来一个牛逼的全栈程序猿，
 但是这个牛逼的全栈程序猿首要任务就是维护精通原来离职程序猿的技能，准么办？全栈程序猿只能适配原来Android高手的代码，不能将自己其他的IOS、PHP等技能展示，
 所以MonkeyHoleTarget的codingAll技能需要适配为专攻的”Can code Android!”技能。这就是一个典型的对象适配器模式（对象在SkillAdapter适配器类中作为成员属性）。

 个人理解： 对象适配器是新建一个类，继承或者实现目标，里面有自己的类作为成员变量，然后把目标的方法里面逻辑替换成自己的方法即可，外面调用不变。
 */
public class AdapterObject
{
    public static void main(String[] args) {
        MonkeyAndroid  monkeyAndroid = new MonkeyAndroid();
        MonkeyAdapter adapter = new MonkeyAdapter(monkeyAndroid);
        adapter.codeAll();
    }




}

//目标接口（Target）
class MonkeyHoleTarget
{
    public void codeAll()
    {
        System.out.println("我可以写全栈代码");
    }
}

//需要设配的第三方类，或者接口
class MonkeyAndroid
{
    public void skill()
    {
        System.out.println("精通(只会)Anndroid");
    }
}

//适配器出场了，duang duang duang
class MonkeyAdapter extends MonkeyHoleTarget
{
    private MonkeyAndroid monkeyAndroid;

    public MonkeyAdapter(MonkeyAndroid monkeyAndroid)
    {
        this.monkeyAndroid=monkeyAndroid;
    }

    @Override
    public void codeAll()
    {
        monkeyAndroid.skill();
    }

}

