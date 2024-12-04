class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai do class constructor hoon");
    }
}

public class this_super {
    public static void main(String[] args) {

        //Creating a object of Ekclass
        EkClass e = new EkClass(786);
        System.out.println(e.getA());

        //Creating a object of Doclass
        DoClass d = new DoClass(5);
    }
}