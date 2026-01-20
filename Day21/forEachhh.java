import java.util.*;
class Students {
    int id;
    String name;
    double marks;

    Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}
public class forEachhh {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Kabir","rohit","Devansh");
        System.out.println("NAmes: "+names);
        names.forEach(name -> System.out.println(name));

        List<Integer> nums=Arrays.asList(10,5,56,44);
        System.out.println("NUMS"+nums);
        nums.forEach(number -> System.out.println(number));

        List<Students> stu=List.of(  new Students(2,"Murali",45.2),
                                     new Students(1,"Mudfd",85.2),
                                     new Students(3,"fsf",75.2),
                                     new Students(4,"rohit",50.2));
            
        System.out.println(stu);
        stu.forEach(student->System.out.println(student));


        
    }
}
