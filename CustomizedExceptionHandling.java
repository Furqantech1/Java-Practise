class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class CustomizedExceptionHandling {
    public static void main(String[] args) {
        try{
            voter(20);
        }
        catch(Exception a){
            System.out.println("Age not valid to vote");
            System.out.println(a);
        }
    }
    public static void voter(int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("Not elegible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
    