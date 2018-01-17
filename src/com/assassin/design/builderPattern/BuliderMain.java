package com.assassin.design.builderPattern;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/17 16:25
 * @Version:
 * @Description:
 */

class BuliderMain
{
    public static void main(String[] args) 
    {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        builder.setAge(18);
        builder.setName("ShayCormac");
        
        BuilderPattern builderPattern = builder.build();
        System.out.println(builderPattern.getAge());
        System.out.println(builderPattern.getName());
        
    }
}
