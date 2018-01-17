package com.assassin.design.builderPattern;

import javafx.util.Builder;

/**
 * @Author: Shay-Patrick-Cormac
 * @Email: fang47881@126.com
 * @Ltd: 金螳螂企业（集团）有限公司
 * @Date: 2018/1/17 16:08
 * @Version:
 * @Description: 构造者模式
 */

class BuilderPattern
{
    private String name;
    private int age;
    private long currentTime;
    private float score;
    private boolean isMale;
    
    //构造方法私有

    private BuilderPattern() 
    {
        
    }
    
    //静态的builder
    static class Builder
    {
        private String name;
        private int age;
        private long currentTime;
        private float score;
        private boolean isMale;
        private BuilderPattern builderPattern;
        
        public Builder() 
        {
            builderPattern = new BuilderPattern();
        }
        
        public Builder setName(String name)
        {
            builderPattern.name = name;
            return this;
        }
        public Builder setAge(int age)
        {
            builderPattern.age = age;
            return this;
        }
        
        public BuilderPattern build()
        {
            return builderPattern;
        }

      
    }
    
    //调用它？
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
