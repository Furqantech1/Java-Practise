class Student{
    int rollno;
    String name;
    Student(int a, String b){
        rollno = a;
        name = b;
    }
    void show(){
        System.out.println("Name is: "+name);
        System.out.println("Roll no is: "+rollno);
    }
}
class test extends Student{
    int m1,m2;
    test(int a, String b, int i, int j){
        super(a,b);
        m1 = i;
        m2 = j;
    }
    void print(){
        show();
        System.out.println("M1="+m1);
        System.out.println("M2="+m2);
    }
}
class Result extends test{
    double avg;
    Result(int a, String b, int i, int j){
        super(a, b, i, j);
    }
    void calc_avg(){
        avg = m1+m2/2.0;
    }
    void display(){
        print();
        System.out.println("Average="+avg);
    }
}
public class MultilevelInheritence {
    public static void main(String[] args) {

        Result r = new Result(17, "Maaz", 72, 80);
        r.calc_avg();
        r.display();
    }
}
