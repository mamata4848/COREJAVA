package com.training.org;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int i=0;
        /*while(i<=10){
            System.out.println("Value od i "+i);
            i+=3; //increment
        }*/
       /* while(true){
            System.out.println("..");
        }*/
        int sum=0;
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Iteration");
        int number=scanner.nextInt();

        while (number>=0){
            sum+=number;
            number--;
        }
        System.out.println("Sum of Elements "+sum);*/

        //do-while Examples

        /*do{
            System.out.println("Value of i "+i);
            i++;
        }while(i<=10);*/

       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();
        char ch;

        System.out.println("Enter second number");
        int num2=input.nextInt();

        int choice;
        do{
            System.out.println("1] Addition\n2] Subtraction\n3] Mulitplication\n4] Division\n\nEnter your choice\n");
            choice=input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Addition -> "+(num1+num2));
                    break;

                case 2:
                    System.out.println("Subtraction -> "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplcation -> "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division -> "+(float)(num1/(float)num2));
                    break;
            }

            System.out.println("Do you want to continue....");
            ch=input.next().charAt(0);

        }while(ch=='Y'||ch=='y');*/

        //for loop examples

        /*for(int j=0; j<=10; j++){
            System.out.println("Value of j " +j);
        }*/

        int k=0;
       /* for (;k<=10;){
            *//*if(k>10){
                break;
            }*//*
            System.out.println("Value of k " +k);
            k++;
        }*/

       /* for (int l=10; l>=0;l--)
            System.out.println("Vlaue of l " +l);*/

        /*String name[]={"Chiku","Annu","Mannnu","Chintu","Pappu"};
        String message="Hello World";
        int []number={10,20,30,40};
        for(String str:name)
            System.out.println(str);

        for(char ch:message.toCharArray())
            System.out.println(ch);

        for (int o=0;o<number.length;o++)
            System.out.println(number[o]);*/

       /* String message="JAVA programming";
        String reversedString="";
        int y=message.length()-1;
        do{
            reversedString+=message.charAt(y);
            y--;
        }while (y>=0);

        System.out.println("Reversed String "+reversedString);*/

        int ct=0,n=0,d=1,j=1;
        while(n<25)
        {
            j=1;
            ct=0;
            while(j<=d)
            {
                if(d%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf("%d ",d);
                n++;
            }
            d++;
        }


    }
}
