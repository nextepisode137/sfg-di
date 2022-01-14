package com.nextepisode137.sfgdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SfgdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgdemoApplication.class);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.sayHello());
	}

}
