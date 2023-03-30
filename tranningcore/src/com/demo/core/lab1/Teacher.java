package com.demo.core.lab1;

public class Teacher {
	    private String name;
	    private Subject subject;
	    
	    public Teacher(String name, int age, Subject subject) {
	        this.name = name;
	        this.subject = subject;
	    }
	    
	    public Teacher(Subject subject) {
	        this.subject = subject;
	    }
	    public void teach(Class cls) {
	        System.out.println("Teacher " + name + " teaching " + subject.getName() + " for " + cls.getName());
	    }
	    
}

