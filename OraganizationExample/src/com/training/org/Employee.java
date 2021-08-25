package com.training.org;
import java.util.Scanner;
public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(){
        System.out.println("Default constructor of Employee is called");
        empId=0;
        name="";
        salary=0;
    }
    public Employee(int empId, String name, double salary) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    //setters
    public void setSalary(double salary){
        this.salary=salary;
    }

    //getters
    public double getSalary(){
        return salary;
    }

    public void acceptEmployeeDeatails(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter empId");
        empId=Integer.parseInt(input.nextLine());

        System.out.println("Enter name");
        name=input.nextLine();

        System.out.println("Enter salary");
        salary=input.nextDouble();
    }

    public void showEmployeeDetails(){
        System.out.println("Employee details are"+empId+" Name :- "+name+" Salary :- "+salary);
    }

}
