package com.altuhin.spring;

public class DependentClass {
	
	DependencyClass dependencyClass;

	
	DependentClass(	DependencyClass dependencyClass){
		this.dependencyClass = dependencyClass;
	}
	
	
	public void method2() {
		System.out.println("Dependency class: method2() ");
	}

}
