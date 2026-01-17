import java.util.ArrayList;
import java.util.List;

public class program3 {
    public static void main(String[] args) {
        


    
    }
}
class Employee{
    int empID;
    String name;
    double salary;
    private Employee(int empID,String n,double s){
        this.empID=empID;
        this.name=n;
        this.salary=s;
    }
    public static void NewEmpObjects(int empID,String name,double salary){
        return new Employee(employeeId, name, salary);
    }
    
    public static void DisplayEmpDetail(){
        System.out.println("EmployeeDetails:");
        System.out.println("EmployeeId: "+empID);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);


    }

}
class Company{
    List<String> l=new ArrayList<String>();
    l.add("rohit");
    l.add("kalyan");
    l.add("balaji");

    System.out.println(l);
}