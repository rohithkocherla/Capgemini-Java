//question
// Create a Java class named Student with the following requirements:
// 	1.	Instance variables:
// 		int id
// 		String name
// 		int[] marks (size 3)
// 	2.	Create:
// 		A parameterized constructor to initialize all variables.
// 		A copy constructor that creates a deep copy of a Student object.
// 	3.	In the main method:
// 		Create one Student object using the parameterized constructor.
// 		Create another Student object using the copy constructor.
// 		Modify the marks of the copied object.
// 		Print details of both objects.
// 	4.	Ensure that changes made to the copied object do not affect the original 
// 	object.

public class Student2 {
    int id;
    String name;
    int[] marks;
    public Student2(int id, String name, int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public Student2(Student2 obj){
        this.id=obj.id;
        this.name=obj.name;
        this.marks=obj.marks;
    }
    public static void main(String args[]){
        int[] marks={22,32,54};
        Student2 ref1= new Student2(101,"rohit",marks);
        Student2 ref2= new Student2(ref1);

        ref2.marks=new int[]{55,75,98};    //updating copied ones marks

        System.out.println("Details of first constructor");
        System.out.println(ref1.id);
        System.out.println(ref1.name);
        for(int x:ref1.marks){
        System.out.println(x+" ");
        }
 
        System.out.println();

        System.out.println("Details of copy: ");
        System.out.println(ref2.id);
        System.out.println(ref2.name);
        for(int x:ref2.marks){
        System.out.println(x+" ");
        }
    }
}

