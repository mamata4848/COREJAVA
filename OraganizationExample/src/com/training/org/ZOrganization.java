package com.training.org;

public class ZOrganization {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.showEmployeeDetails();

        Employee e2=new Employee(101,"EShan",10000);
        //e2.showEmployeeDetails();
        System.out.println(e2);


        Employee e3=new Employee();
        e3.acceptEmployeeDeatails();
        System.out.println(e3.getSalary());
        //e3.showEmployeeDetails();
        System.out.println(e3);

       /* Employee e2=new Employee(101,"EShan",10000);
        e2.setSalary(e2.getSalary()+5000);
        e2.showEmployeeDetails();

        Employee e3=new Employee();
        e3.acceptEmployeeDeatails();
        e3.showEmployeeDetails();*/

        Bank bank1=new Bank();
        bank1.showBankDeatils();

        Bank bank2=new Bank("AXIS","12343453","SAVING",23423);
        bank2.showBankDeatils();
    }
}