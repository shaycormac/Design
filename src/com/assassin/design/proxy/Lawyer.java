package com.assassin.design.proxy;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/26 09:49
 * @Version: 1.0
 * @Description: 静态代理律师，需要实现共同的接口
 *  其实发现，和装饰者的区别在于，代理就代理，在共同的方法上啥也不做，而装饰者在共同的方法的前后代码做一些事情。
 */

class Lawyer implements ILawsuit {
    //持有代理人的引用，最好是这个接口，符合设计原则，依赖倒置，这样不管小明，还是小张，都可以使用这个律师
    private ILawsuit lawsuit;

    //为小明代理


    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    @Override
    public void submit() {

        lawsuit.submit();
    }

    @Override
    public void burden() {
        lawsuit.burden();
    }

    @Override
    public void defend() {
        lawsuit.defend();
    }

    @Override
    public void finish() {
        lawsuit.finish();
    }
}
