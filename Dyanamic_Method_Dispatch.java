class Phone{
    public void On(){
        System.out.println("Turning on Phone");
    }
    public void greet(){
        System.out.println("Hello, Good Morning");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    @Override
    public void On(){
        System.out.println("Turning on SmartPhone");
    }
}
public class Dyanamic_Method_Dispatch {
    public static void main(String[] args) {
    //     Phone obj = new Phone();
    //     obj.greet();

    Phone obj = new SmartPhone(); // It is allowed i,e  super class --> Sub class
    // SmartPhone obj = new Phone(); // Not Allowed

    obj.greet();
    obj.On();
    // obj.music();
    }
}
