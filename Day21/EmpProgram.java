import java.util.*;

public class EmpProgram {
    public static void main(String[] args) {
        List<Emp> emps=List.of(
            new Emp(1,"Rohit",654653),
            new Emp(2,"yellandhar",54545),
            new Emp(3,"Ramu",64354));
            System.out.println(emps);
            emps.forEach(employee ->employee.PrintDetails());

            System.out.println("using method reference: ");
            emps.forEach(Emp :: PrintDetails);
    }
    
}
class Emp{
    int id;
    String name;
    double sal;
    public Emp(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void PrintDetails(){
        System.out.println("--------------");
        System.out.println("ID: "+id);
        System.out.println("Name:"+name);
        System.out.println("salary:"+sal);
    }
}