
    import java.util.Comparator;
import java.util.List;


class Student{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return id+" "+name;
    }
}


public class SortStudentName {   
     public static void main(String[] args) {
        List<Student> st=List.of(
            new Student(2,"Rohit"),
            new Student(1,"Trilock"),
            new Student(3,"Yashu"));
            System.out.println("In ascending order: ");
            st.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

            System.out.println("desc order:");
            
            st.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);
           
    }
}
