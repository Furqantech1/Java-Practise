class PERSON{
    //PERSON(){}
    String name,address;
    int id;
    PERSON(String a, String b, int c){
        name = a;
        address = b;
        id = c;
    }
    void show(){
        System.out.println("Name is : "+name);
        System.out.println("Address is : "+address);
        System.out.println("ID is : "+id);
    }
}
class EMP extends PERSON{
    //EMP(){}
    int salary,increment;
    EMP(String a, String b, int c, int i, int j){
        super(a,b,c);
        salary = i;
        increment = j;
    }
    void calculate(){
        salary += increment;
    }
    void print(){
        show();
        System.out.println("Salary after increment is : "+salary);
        System.out.println("Increment is : "+increment);
    }
}
class Student extends PERSON{
    //Student(){}
    int m1,m2,m3;
    double average = 0;
    Student(String a, String b, int c, int k, int l, int m){
        super(a, b, c);
        m1 = k;
        m2 = l;
        m3 = m;
    }
    void cal_avg(){
        average = m1+m2+m3/3.0;
    }
    void display(){
        show();
        System.out.println("The average is : "+average);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        PERSON p = new PERSON("Furqan","Belagavi",32);
        p.show();
        
        EMP e = new EMP("Maaz","kudachi",17,52000,4000);
        e.calculate();
        e.print();

        Student s = new Student("Iqbal","Dharwad",45,78,54,90);
        s.cal_avg();
        s.display();
        
    }
}
