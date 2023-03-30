package com.demo.core.lab2;

import java.util.Scanner;

public class program {

	
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Ten nhan vien: ");
        String name = scanner.nextLine();

        System.out.print("Tuoi: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cong viec: ");
        String job = scanner.nextLine();

        System.out.print("Luong: ");
        double salary = scanner.nextDouble();
        
       /* System.out.print("Enter employee salary: ");
        String department = scanner.nextLine();*/

        emloyee e = new emloyee(name, age, job, salary);

        System.out.println(e.toString());

        scanner.close();
}
}
