import java.util.Scanner;
public class PractiseSet05 {
    public static void main(String[] args) {
        System.out.print("Enter the number of stars: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
//         for(int i=n; i>0; i--){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             } 
//             System.out.print("\n");
//         }
//     }
// } 
        // Question 2

        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     sum += (2*i);
        // }
        // System.out.print("Sum of the even number is : "+sum);

        //Question 3
        // System.out.println("The multiplication table of entered number is : ");
        // for(int i=1; i<=10; i++){
        //     System.out.printf("%d X %d = %d \n",n,i,(n*i));
        // }

        //Question 4

        System.out.println("The reverse multiplication table is: ");
        for(int i=10; i>0; i--){
            System.out.printf("%d X %d = %d \n",n,i,(n*i));
        }
    }
}
