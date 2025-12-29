import java.util.Scanner;

public class DeptRole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department: ");
        String dept=sc.nextLine();

        switch (dept) {
            case "IT":
                String role=sc.nextLine();
                switch (role) {
                    case "developer":
                        System.out.println("yor are an" + role + "working in" + dept + "department");
                        break;
                    
                    case "tester":
                        System.out.println("yor are an" + role + "working in" + dept + "department");
                        break;
                    case "Devops engineer":
                        System.out.println("yor are an" + role + "working in" + dept + "department");
                        break;

                    }  
        
            
                
                
        }
    }
}
