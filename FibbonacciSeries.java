import java.util.Scanner;

public class FibbonacciSeries {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        System.out.print("The Fibonacci series is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
