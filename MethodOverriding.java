class A{
    int a;
    public int Furqan(){
        return 3;
    }
    void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    void meth2(){
        System.out.println("I am method 2 of Class B");
    }
    void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {

        //Creating a object of Class A
        A a =new A();
        a.meth2();

        //Creating a pbject of class B
        B b= new B();
        b.meth2();
    }
}
