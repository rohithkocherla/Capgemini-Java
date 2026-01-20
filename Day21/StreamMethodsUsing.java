import java.util.*;
import java.util.stream.Collectors;


class Student{
    int id;
    String name;
    double marks;
    public Student(int is,String name,double marks){
        this.id=is;
        this.name=name;
        this.marks=marks;
    }
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class StreamMethodsUsing {
    public static void main(String[] args) {
        
    
    List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    System.out.println("\nTo print all elements one by one:");
    nums.stream().forEach(System.out :: println);

    System.out.println("\nto print even nums: ");
    nums.stream().filter(n -> n%2==0).forEach(System.out :: println);

    System.out.println("\nto print odd num with extra value 3: ");
    nums.stream().filter(n -> n%2!=0).map(n -> n+3).forEach(System.out :: println);

    System.out.println("\nto print even nums and store in another list: ");
   List<Integer> even_collector = nums.stream().filter(n -> n%2==0).collect(Collectors.toList());
   System.out.println(even_collector);

   List<String> names=List.of("Rohit","Aditya","Ramesh","Somesh","Giresh");
   System.out.println("\nprint objects end with sh using stream:");
   names.stream().filter(name -> name.endsWith("sh")).forEach(System.out::println);

   System.out.println("\nto println odd nums and store in another list:");
   List<Integer> odd_collector = nums.stream().filter(n -> n%2!=0).collect(Collectors.toList());
   System.out.println(odd_collector);


   List<Student> st=List.of(
                            new Student(3,"Ramu",45.1),
                            new Student(3,"tarun",75.1),
                            new Student(3,"yashuu",85.1),
                            new Student(1,"rohit",95.1));
                System.out.println("\nprint those who got more than 80 marks using stream:");

               st.stream().filter(s -> s.marks>80).forEach(System.out::println);

}
}