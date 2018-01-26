package com.assassin.design.chainOFResponsiblity.pure;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/23 10:46
 * @Version: 1.0
 * @Description: 小明有50000元需要报销
 */

class WipeOutMoney 
{
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        DirectorLeader directorLeader = new DirectorLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        BossLeader bossLeader = new BossLeader();
        //把自己的节点放在下一个
        groupLeader.nextLeader = directorLeader;
        directorLeader.nextLeader = managerLeader;
        managerLeader.nextLeader = bossLeader;
        
        //现在小王要报销50000元了，先找组长报销，流程开始
        groupLeader.handleRequest(8000);
        
    }
}
