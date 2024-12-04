import java.util.Scanner;
public class Practise_set04 {
    public static void main(String[] args) {
        System.out.println("Enter the marks in three subjects: ");
        Scanner  Sub = new Scanner(System.in);
        byte m1 = Sub.nextByte();
        byte m2 = Sub.nextByte();
        byte m3 = Sub.nextByte();
        float percentage = (m1+m2+m3)/3.0f;
        if (percentage>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("You have passed the Exam!");
        }
        else{
            System.out.println("You have failed");
        }

        Question 02

        Scanner tax = new Scanner(System.in);
        System.out.print("Please Enter your Annual Income: ");
        int Income = tax.nextInt();
        if (Income<250000){
            System.out.println("NO TAX");
        }
        else if (Income>=250000 && Income<500000){
            float Tax = Income*0.05f;
            System.out.println(("Your payable tax is: "+ Tax));
        }
        else if (Income>=500000 && Income<1000000){
            float Tax = Income*0.2f;
            System.out.println(("Your payable tax is: "+ Tax));
        }
        else{
            float Tax = Income*0.3f;
            System.out.println(("Your payable tax is: "+ Tax));
        }

        // Question 03

        Scanner dy = new Scanner(System.in);
        System.out.print("Enter the No of Day: ");
        int day = dy.nextInt();
        switch(day){
            case 1 :
            System.out.println("Monday!");
            break;
            case 2 :
            System.out.println("Tuesday!");
            break;
            case 3 :
            System.out.println("Wednesday!");
            break;
            case 4 :
            System.out.println("Thursday!");
            break;
            case 5 :
            System.out.println("Friday!");
            break;
            case 6 :
            System.out.println("Saturday!");
            break;
            case 7 :
            System.out.println("Sunday HURRAY!!");
            break;
        }
    }
}

        //Question 04

        Scanner Yr = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = Yr.nextInt();
        if (((year%4==0) && (year%100!=0)) || (year%400==0)){
            System.out.println("Entered Year is a Leap Year!");
        }
        else{
            System.out.println("Entered year is not a Leap year");
        }

        //Question 05

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL of website: ");
        String Website = sc.nextLine();
        if (Website.endsWith("com")){
            System.out.println(("Entered Website is a Commercial Website"));
        }
        else if (Website.endsWith("org")){
            System.out.println(("Entered Website is a Orgnizational Website"));
        }
        else if (Website.endsWith("in")){
            System.out.println(("Entered Website is a Indian Website"));
         }
        else{
            System.out.println("Entered url cannot be recognized");
        }

        // Testing do-while loop

        int b = 10;
        do{
            System.out.println(b);
            b++;
        }while(b<5);
    }
}
