package com.training.org;

import java.util.Scanner;

public class IFConditionExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Input first number: ");
        //int temp1=scanner.nextInt();
        int x=scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();
        System.out.print("Input third number: ");
        int z = scanner.nextInt();
        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        }
        else if ((x == y) || (x == z) || (z == y)) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }

      //  System.out.println((x / 10 == 0 && x / 100 == 0) ? "single digit" : "double digit");

        //System.out.println((x > 9 && x < 100) || (x < -9 && x > -100)? "Double Digit":"Single Digit" );

        /*System.out.println("Enter value for second number");
        int temp2=scanner.nextInt();*/

        /*if(temp1>temp2)
            System.out.println("Temp1 is greater than num2");*/
            //System.out.println((temp1>temp2)?"Temp1 is greater than num2":"not");


        //System.out.println((temp%2==0)?"Temp is even":"Temp is odd");
        /*if(temp%2==0)
            System.out.println("Temp is Even");
        else
            System.out.println("Temp is  odd");
*/


    }
}
