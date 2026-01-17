//WAJP that prints all elements of a List one by one using the get() method only.
    
    import java.util.ArrayList;
    import java.util.*;
    
    public class program4 {
    
        public static void main(String[] args) {
            List<String > al=new ArrayList<>();
            al.add("Ramu");
            al.add("rohii");
            al.add("kiran");
            al.add("yashuu");
            al.add("trilock");
            al.add(null);
            

            for(int i=0;i<al.size();i++){
                System.out.println(al.get(i));
            }
            
    
        }
        
    }
