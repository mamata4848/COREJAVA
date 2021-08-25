package com.training.org;

import java.util.Scanner;

public class SwitchClassExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First Num");
        int num1=scanner.nextInt();

        System.out.println("Enter Second Num");
        int num2=scanner.nextInt();

        System.out.println("1] Addition /n2] Subtraction \n3] Multiplication \n4] Division \n\n\nEnter your choice ");
        int choice= scanner.nextInt();


        switch (choice){
            case 1:
            System.out.println("Subtraction"+(num1+num2));
            break;
            case 2:
            System.out.println("Subtraction"+(num1-num2));
            break;
            case 3:
            System.out.println("Multiplication"+(num1*num2));
            break;
            case 4:
            System.out.println("Division"+(float)(num1/(float)num2));
            break;
            default: System.out.println("Wrong Choice");
        }
    }
}
