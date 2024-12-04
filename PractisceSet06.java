import java.util.Scanner;
import java.util.regex.Pattern;

public class PractisceSet06 {
    // static void multiplicationTable(int n) {
    //     for (int i = 1; i <= 10; i++) {
    //         System.out.printf("%d X %d = %d%n", n, i, n * i);
    //     }
    // }

    // static void Pattern(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<i+1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static int sumRecursion(int n){
        // Base condition of Recursion (to terimate)
    //     if(n==1){
    //         return 1;
    //     }
    //     return n+sumRecursion(n-1);
    // }

    static void revPattern(int n){
        for(int i=n; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Question01

        // System.out.println("Enter the Number:");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // multiplicationTable(num);

        // Question 02

        //  System.out.println("Enter the Number:");
        //  Scanner sc = new Scanner(System.in);
        //  int Num = sc.nextInt();
        //  System.out.println("The pattern is : ");
        //  Pattern(Num);

        // Question 03

        // System.out.println("Enter the Number:");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.print("The sum of first n natural number is  "+sumRecursion(num));

        // Questin 04

         System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        revPattern(num);
    }
}
