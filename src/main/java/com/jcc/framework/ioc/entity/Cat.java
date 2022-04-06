package com.jcc.framework.ioc.entity;

import org.springframework.stereotype.Component;

/**
 * @ClassName: Cat.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/31 12:02 上午:00
 * @Description: TODO
 */
@Component
public class Cat implements Pet{
    @Override
    public void move() {
        System.out.println("cat is eating");
    }
}
