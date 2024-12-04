class Employee{
    int salary;
    String name;

    int getSalary(){
        System.out.print("The salary is:");
        return salary;
    }
    String getName(){
        System.out.println("Name of employee is ");
        return name;
    }
    void setName(String n){
        name = n;
    }
}
public class PractiseSet08 {
    public static void main(String[] args) {
        Employee Furqan = new Employee();
        Employee Maaz = new Employee();

        // First employee
        Furqan.setName("Furqan Naikwadi");
        System.out.println(Furqan.getName());

        Furqan.salary = 80000;
        System.out.println(Furqan.getSalary());

        // Second employee
        Maaz.setName("MuhammadMaaz Kole");
        System.out.println(Maaz.getName());

        Maaz.salary =85000;
        System.out.println(Maaz.getSalary());
    }
}
