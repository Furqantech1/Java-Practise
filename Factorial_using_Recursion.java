import java.util.Scanner;

public class Factorial_using_Recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
            
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner f = new Scanner(System.in);
        int num = f.nextInt();
        System.out.printf("The factorial of %d is: %d\n", num, factorial(num));
    }
}

