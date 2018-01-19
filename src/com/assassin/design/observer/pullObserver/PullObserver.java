package com.assassin.design.observer.pullObserver;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/19 13:44
 * @Version: 1.0
 * @Description: 拉方式
 * 
 * 拉方式的观察察者模式实例：

主题对象在通知观察者的时候，只传递少量信息。如果观察者需要更具体的信息，由观察者主动到主题对象中获取，相当于是观察者从主题对象中拉数据。
一般这种模型的实现中，会把主题对象自身通过update()方法传递给观察者，这样在观察者需要获取数据的时候，就可以通过这个引用来获取了。
 
 
 个人觉得观察者方式的推和拉区别在于  推是仅仅向观察者推送需要更新的消息罢了，而拉则是主题者有变动了，只是把变动放在自己的内部
 属性里面，而把自己作为参数，传给观察者，观察者自己去对象里取数据。
 * 
 */

interface PullObserver
{
    void update(PullSubject pullSubject);
}
