public class EmployeeRecord {
    public static void main(String[] args) {
        Emp e=new Emp();
        e.updateDetails("Alice");
        e.updateDetails("Bob","HR");
        e.updateDetails("Charlie", "Finance", 70000);

        
    }
}
class Emp{
    private String name;
    private double baseSalary;
    private String dept;
    public String getN(){
        return name;
    }
    public double getB(){
        return baseSalary;
    }
    public String getD(){
        return dept;
    }
    public void updateDetails(String name){
        this.name=name;
       System.out.println("Name updated to "+this.getN());
    }
    public void updateDetails(String name,String dept ){
        this.name=name;
        
        this.dept=dept;
        System.out.println("Name and Department updated to "+this.getN()+" "+this.getD());
    }
    public void updateDetails(String name,String dept,double baseSalary){
        this.name=name;
        this.dept=dept;
        this.baseSalary=baseSalary;
        System.out.println("Name, Department, and Salary updated to "+this.getN()+" "+this.getD()+" "+this.getB());
    }

}