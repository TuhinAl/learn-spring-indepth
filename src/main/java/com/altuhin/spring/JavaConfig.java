package com.altuhin.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	public DependencyClass getDependencyClass() {
		return new DependencyClass();
	}
}
