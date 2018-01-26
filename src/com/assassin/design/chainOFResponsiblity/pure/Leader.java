package com.assassin.design.chainOFResponsiblity.pure;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/23 10:25
 * @Version: 1.0
 * @Description: 纯责任链设计模式，要不这个节点全部处理，要不部分处理，不能晦朔上游的节点，实际中用的不多
 * 
 * 本例简单说明，报销，组长报销1000的权限，主管是5000的权限，经理是10000的权限，最终老板的报销权限最大，而这个人报销
 * 50000，可以逐个上报，也可以跨部门上报，但是报完某个部门，不可能再返回来。
 *  模板是这个抽象类里面有下一个要处理的节点对象，以及抽象的方法
 */

abstract class Leader 
{
    /**
     * 下一个节点
     */
    protected Leader nextLeader;
    
    //重点逻辑了
    /**
     *  根据金额，从而发起不同的节点
     */
    public final void handleRequest(int money)
    {
        if (money <=limitedMoney())
        {
            //自己就可以报销了，不用再往下各节点走了
            handle(money);
        }else 
        {
            //那么需要上一级来处理
            if (null!=nextLeader) 
            {
                nextLeader.handleRequest(money);
            }
            
        }
        
    }


    //抽象的两个方法
    /**
     * 能报销的金额
     */
    public abstract int limitedMoney();

    /**
     * 报销金额自己节点处理的逻辑
     */
    public abstract void handle(int money);
    
}
