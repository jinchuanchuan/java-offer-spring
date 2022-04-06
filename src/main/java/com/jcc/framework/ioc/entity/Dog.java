package com.jcc.framework.ioc.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Dog.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 2:17 下午:00
 * @Description: TODO
 */

@Component
@Primary
public class Dog implements Pet{

    @Override
    public void move() {
        System.out.println("dog is running!");
    }
}
