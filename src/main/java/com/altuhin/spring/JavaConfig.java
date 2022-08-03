package com.altuhin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public DependencyClass getDependencyClass() {
		return new DependencyClass();
	}
	
	

	@Bean
	public DependentClass getDependencyClass(DependencyClass dependencyClass) {
		return new DependentClass(dependencyClass);
	}
	
	
}
