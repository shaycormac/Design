package com.assassin.design.chainOFResponsiblity.pure;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/23 10:44
 * @Version:
 * @Description:
 */

class BossLeader extends Leader {
    @Override
    public int limitedMoney() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("mmp,老板可以报销"+money+"元，无限制");
    }
}
