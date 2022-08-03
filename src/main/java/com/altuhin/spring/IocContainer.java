package com.altuhin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocContainer {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);

	}

}
