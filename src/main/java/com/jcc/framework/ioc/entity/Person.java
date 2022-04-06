package com.jcc.framework.ioc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Person.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 2:16 下午:00
 * @Description: TODO
 */
@Component
public class Person {

    @Value(value = "1")
    private Integer id;
    @Value("hanmeimei")
    private String name;

    @Autowired
    @Qualifier("bird")
    private Pet pet;

    public void call() {
        pet.move();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
