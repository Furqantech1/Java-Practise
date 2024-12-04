class Base1{
    Base1(){
        System.out.println("I am a constructer");
    }
    Base1(int x){
        System.out.println("I am overloaded constructer with value of 'x' as: "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        // super(0);
        System.out.println("I am a derived class constructer");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am overloaded constructer of derived class with value of 'y' as: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("Child of derived class constructor ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am overloaded constructer of ChildOfDerived class with value of 'z' as: "+z);
    }
}
public class ConstructerInheritance {
    public static void main(String[] args) {

        //Creating a object of Base class
        // Base1 b1 = new Base1();

        //Creating a object of Derived class
        //Derived1 d1 = new Derived1(25,15);

        //Creating a object of child of derived
        ChildOfDerived c1 = new ChildOfDerived(7,8,6);

    }
}

// super keyword use to access the member of subclass that has been hidden by the member of subclass

// class A{
//     int i;
// }
// class B extends A{
//     int i;
//     B(int a,int b){
//         super.i = a;
//         i = b;
//     }
//     void display(){
//         System.out.println("The SuperClass i = "+super.i); 
//         System.out.println("The SubClass i = "+i); 
//     }
// }
// class ConstructerInheritance{
//     public static void main(String[] args) {
//         B obj = new B(10,20);
//         obj.display();
//     }
// }