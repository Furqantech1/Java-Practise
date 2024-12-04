import java.util.Scanner;

class PercentageExercise {
    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        
        System.out.println("Enter the marks in 5 subjects");
        
        int m1 = P.nextInt();
        int m2 = P.nextInt();
        int m3 = P.nextInt();
        int m4 = P.nextInt();
        int m5 = P.nextInt();
        
        float sum = m1 + m2 + m3 + m4 + m5;
        float percentage = sum / 5; 
        
        System.out.println("The percentage of student is:" + percentage + "%");
    }
}
