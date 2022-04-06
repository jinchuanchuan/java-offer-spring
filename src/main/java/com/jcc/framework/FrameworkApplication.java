package com.jcc.framework;

import com.jcc.framework.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(FrameworkApplication.class, args);
		Person person = applicationContext.getBean(Person.class);
    	System.out.println("Name is " + person.getName());
    	person.call();
	}

}
