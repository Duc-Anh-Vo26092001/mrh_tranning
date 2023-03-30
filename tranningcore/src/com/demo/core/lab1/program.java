package com.demo.core.lab1;

public class program {

	public static void main(String[] args) {
		Subject math = new Subject("Mathematics");
		/* math.setClassId(1); */

		Teacher tam = new Teacher("Tam", 30, math);
		Class cls = new Class(1, "Class 1");
	    tam.teach(cls); 

	}

}
