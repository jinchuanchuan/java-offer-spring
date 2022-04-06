package com.jcc.framework.ioc.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Bird.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 2:18 下午:00
 * @Description: TODO
 */
@Component()
//@Qualifier(value = "bird")
public class Bird implements Pet{

    @Override
    public void move() {
        System.out.println("bird is flying!");
    }
}
