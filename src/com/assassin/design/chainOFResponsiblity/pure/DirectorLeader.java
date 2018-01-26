package com.assassin.design.chainOFResponsiblity.pure;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/23 10:43
 * @Version:
 * @Description:
 */

class DirectorLeader extends Leader {
    @Override
    public int limitedMoney() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("mmp,主管可以报销"+money+"元");
    }
}
