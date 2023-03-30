package com.demo.core.lab1;

public class Subject {
	private String name;
    private int classId;
    
    public Subject(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getClassId() {
        return classId;
    }
    
    public void setClassId(int classId) {
        this.classId = classId;
    }
}

