import java.util.Scanner;
public class Practiset_14 {
    public static void main(String[] args) {
        // int a,b,c;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a And b:");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // try{
        //     c=a/b;
        //     System.out.println("The division value is "+c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Haha");
        // }
            
        // catch(IllegalArgumentException e){
        //     System.out.println("hehe");
        // }

        boolean flag = true;
        int [] marks = new int[3];
        marks[0]=56;
        marks[1]=87;
        marks[2]=78;
        int i =0;
        int index;
        try{
            while (flag && i<5) {
                System.out.println("Enter the index");
                index = sc.nextInt();
                System.out.println("The value of marks at "+index+" is:"+marks[index]);
                break;
            }
        }
        catch(Exception e){
            System.out.println("Invaild index");
            i++;
        }
    }
}
