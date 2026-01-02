//question
// WAJP to create student class consist of 4 data such as:
// 	id, name , percentage, college name
// create parameterized constructor to initialize only id.
// -create parameterized constructor to initialize only name.
// -create parameterized constructor to initialize only percentage.
// -create parameterized constructor to initialize id and name.
// -create parameterized constructor to initialize id and percentage.
// -create parameterized constructor to initialize name and percentage.
// -create parameterized constructor to initialize id , name and percentage.
// -create default / no argument constructor to assign default values.
// -create one static method called printDetail to print all the details of 
// student.
// -in main method create objects using all constructors.

public class student {
    int id;
    String name;
    double percentage;
    String collegename="ABC College";

    public student(int id){
        this.id=id;
    }
    public student(String name){
        this.name=name;
    }
     
     public student(double percentage){
        this.percentage=percentage;
    }
     public student(int id, String name){
        this.id=id;
        this.name=name;
    }
     public student(int id, double percentage){
        this.id=id;
        this.percentage=percentage;
    }
     public student(String name, double percentage){
        this.name=name;
        this.percentage=percentage;
    }
     public student(int id, String name,double percentage){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
    }
    student(){
        id=0;
        name="Not assigned";
        percentage=0.0;
    }
    public static void printDetails(student obj){
        System.out.println("ID: "+obj.id);
        System.out.println("Name: "+obj.name);
        System.out.println("Percenytage: "+obj.percentage);
        System.out.println("college name: "+obj.collegename);

    }

    public static void main(String[] args) {
        student s1=new student(101);
        student s2=new student("Rohith");
        student s3=new student(85.5);
        student s4=new student(102,"Naresh");
        student s5=new student(103, 90.0);
        student s6=new student("kiran", 80.2);
        student s7=new student(104,"Trilock",85.2);
        student s8=new student();

        printDetails(s1);
        System.out.println(" ");
        printDetails(s2);
        System.out.println(" ");
        printDetails(s3);
        System.out.println(" ");
        printDetails(s4);
        System.out.println(" ");
        printDetails(s5);
        System.out.println(" ");
        printDetails(s6);
        System.out.println(" ");
        printDetails(s7);
        System.out.println(" ");
        printDetails(s8);  
    }
}
