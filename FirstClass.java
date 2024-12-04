import java.util.jar.Attributes.Name;
// New class (Custom)
class Employee{
    int id;
    String name;
    // adding a method
    public void displayDetials(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class FirstClass {
    public static void main(String[] args) {

        // Instansiating(Creating) a object of class Employee
        Employee Furqan = new Employee();

        // Intialising the attributes(Data members)
        Furqan.id = 32;  
        Furqan.name = "Furqan Naikwadi";
        System.out.println("Our first custom Class");

        // Displaying the Attributes
        System.out.println(Furqan.id);
        System.out.println(Furqan.name);

        // invoking the method
        // object_name.method
        Furqan.displayDetials();
    }
}
