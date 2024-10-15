package com.sunbeam.Q4;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	Double salary;
	
	
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static int Search(Employee arr[],int id) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].id==id)
				return i;
		}
		return -1;
	}
	
	public static int search(Employee arr[],double salary) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].salary==salary)
				return i;
		}
		return -1;
	}
	
	public static int search(Employee arr[],String name) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].name.equals(name))
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		e[0]=new Employee(5,"preeti", 15000.00);
		e[1]=new Employee(1,"Sneha", 10000.00);
		
		e[2]=new Employee(2,"Anil", 20000.00);
		e[3]=new Employee(3,"Neha", 30000.00);
		e[4]=new Employee(4,"kriti",45000.00);
		System.out.println("MENU");
		System.out.println("0.Exit");
		System.out.println("1.Search by id");
		System.out.println("2.Search by name");
		System.out.println("3.search by salary");
		System.out.println("Enter your choice");
		
		int choice;
		choice=sc.nextInt();
		
			
		if(choice==0) {
			System.exit(0);
		}
		if(choice==1) {
			System.out.println("Enter id = ");
			int id = sc.nextInt();
			
			int res = Search(e, id);
			if(res==-1) {
				System.out.println("Employee not found");
			}
		System.out.println("Employee id found at "+res);
		}
		if(choice==2) {
			System.out.println("Enter name = ");
			String name=sc.next();
			int res=search(e, name);
			if(res==-1) {
				System.out.println("Employee not found");
				
			}
			System.out.println("Employee name found at = "+res);
		}
		if(choice==3) {
			System.out.println("Enter Salary = ");
			double salary = sc.nextDouble();
			int res = search(e, salary);
			if(res==-1) {
				System.out.println("Employee not found");
				
			}
			System.out.println("Employee Salary found at = "+res);
		}
		}
		
	}
	


