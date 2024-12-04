import java.util.Scanner;
public class Practise_set03 {
    public static void main(String[] args) {
        String Name = "FURQAN";
        String lstring = Name.toLowerCase();
        System.out.print("Lower case Srting is :" + lstring);

        Question 02

        String str = "F ur qan";
        String modifiedSrting = str.replace(" ","_");                                                        
        System.out.println(modifiedSrting);

        Question 03

        Scanner st = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = st.nextLine();
        String letter = "Dear "+Name+",Thanks a lot";
        System.out.println(letter.replace(Name,"Harry"));

        Question 03

        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter a String: "));
        String st = sc.nextLine();
        boolean b1 = st.contains("  ") || st.contains("   ");
        if (b1==true){
            System.out.println("String contains Double or Triple spaces");
        }
        else{
            System.out.println("Doesn't contain spaces");
        }
    }
}
