import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        System.out.println("Enter the operands:");
        Scanner num = new Scanner(System.in);
        float a = num.nextFloat();
        float b = num.nextFloat();

        System.out.println("Enter the operation to be performed (operator):");
        String operator = num.next(); 

        switch (operator) {
            case "+":
                System.out.println("Result = " + (a + b));
                break;
            case "-":
                System.out.println("Result = " + (a - b));
                break;
            case "*":
                System.out.println("Result = " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        // switch(operator){
        //     case "+"->System.out.println("Result = " + (a + b));
        //     case "-"->System.out.println("Result = " + (a - b));
        //     case "*"->System.out.println("Result = " + (a * b));
        //     case "/"->{
        //         if(b!=0){
        //     System.out.println("Result = " + (a / b));
        //     }
        //     else{
        //         System.out.println("Cannot divide by zero");
        //     }
        // }
        // }
    }
}
