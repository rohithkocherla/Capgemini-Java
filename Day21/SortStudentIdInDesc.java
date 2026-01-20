
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


public class SortStudentIdInDesc {   
     public static void main(String[] args) {
        List<Student> st=List.of(
            new Student(2,"Rohit"),
            new Student(1,"Trilock"),
            new Student(3,"Yashu"));
            st.stream().sorted(Comparator.comparingInt(Student::getId).reversed()).forEach(System.out::println);
           
    }
}
