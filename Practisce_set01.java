// Question 01
import java.util.Scanner;
public class Practisce_set01 {
   public static void main(String[] args) {
        int a = 45;
        int b = 36;
        int c = 47;
        int sum = a+b+c;
        System.out.println(sum); 

// Question 02
float subject1 = 85;
float subject2 = 75;
float subject3 = 64;
float cgpa = (subject1+subject2+subject3)/30;
System.out.println(cgpa);

// Question 03
System.out.println("What is your Name: ");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.println("Hello " + name + ",have a good day");

// Question 04
System.out.println("Enter the kilometers travelled: ");
Scanner km = new Scanner(System.in);
float KM = km.nextFloat();
float Miles = KM*0.6213f;
System.out.println("The number of miles is:");
System.out.println(Miles);

// Question 05
System.out.println("Enter a number : ");
Scanner num = new Scanner(System.in);
boolean b1 = num.hasNextInt();
System.out.println(b1);
    }
}