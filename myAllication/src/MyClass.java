import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws IOException {int value=100;
       /* float num=10;
        double num1=20;*/
        //1st way to accept values from user [old way]
      /*BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name=reader.readLine();

        System.out.println("Enter your age");
        int age=Integer.parseInt(reader.readLine());

        System.out.println("Enter empId");
        int id=Integer.parseInt(reader.readLine());

        System.out.println("Details are "+name+" AGE "+age+" ID"+id);*/

        //2nd way to accept values from user [new way to accpet]

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id");
        int id=scanner.nextInt();

        System.out.println("Enter name");
        String name=scanner.next();

        System.out.println("Enter salary");
        double salary=scanner.nextDouble();


        System.out.println("Details are "+id+" Name "+name+" Salary"+salary);*/

        //3rd way to accept value GUI
        int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id here"));
        System.out.println("ID is "+id);

        String name= JOptionPane.showInputDialog("Enter name here");
        System.out.println("Name is "+name);

        double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter salary here"));
        System.out.println("Salary is "+salary);

        //4th way to accept value GUI
        /*String message=JOptionPane.showInputDialog(null,"Broccoli is good for health","Green Food",JOptionPane.INFORMATION_MESSAGE);
        String [] options={"ABC","PQR"};
        ImageIcon icon=new ImageIcon("");
        String res=(String)JOptionPane.showInputDialog(null,"Do you want more options","message",JOptionPane.QUESTION_MESSAGE,icon,options,options[0]);

*/


        //System.out.println("My values are "+value+' '+num+' '+num1);
    }
}
