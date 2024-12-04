
// class Animal{
//     void aquaticAnimal(){
//         String fishes;
//         String Seal;
//     }
//     void tresstrialAnimal(){
//         String monkey;
//         String elephant;
//     }
//     void features(){
//         System.out.println("Some are dangers animals ");
//     }
//     Animal(){
//         String name = "LULU Dog";
//     }
// }
//     class Dog extends Animal{
//         void bark(){
//             System.out.println("The kutta bohot bhokata");
//         }
//         void Susu(){
//             System.out.println("Kutta tyre par mutta");
//         }
//     }

// public class Inheritance {
//     public static void main(String[] args) {
//         Animal Whale = new Animal();
//         Dog pug = new Dog();
        
//         // invoking methods
//         pug.features();
//         pug.bark();
//         pug.Susu();
//     }
// }

class Base{
    int x;

    void printMe(){
        System.out.println("I am in a base Class");
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting x now");
        this.x = x;
    }
}
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }public void setY(int y) {
        this.y = y;
    }
}
class Inheritance{
    public static void main(String[] args) {

        //Creating object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating object of Derived class
        Derived d = new Derived();
        d.setX(7);
        System.out.println(d.getX());

        d.setY(32);
        System.out.println(d.getY());
    }
}
