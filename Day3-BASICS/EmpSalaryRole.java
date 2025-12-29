import java.util.Scanner;
public class EmpSalaryRole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in());
        System.out.println("empid");

        int empid=sc.nextInt();
        sc.nextLine();
        System.out.println("empname");
        String empname=sc.nextLine();
        System.out.println("age");
        int age=sc.nextInt();
        

        if(age<21){
            System.out.println("emp is Not eligible to work");
            return;
        }
        System.out.println("1 for IT, 2 for HR,3 for Finance");
        int dept=sc.nextInt();
        String department="";
        String role="";
        int roleChoice;
        roleChoice = sc.nextInt();
        String access = "";
        
        

        switch(roleChoice){
            case 1:
                department="IT";
                System.out.println("1 for developer,2 for testers");
                int roleChoice=sc.nextInt();
                switch (role) {
                    case 1:
                        role="developer";
                    
                    break;

                    case 2:
                        role="testers";
                
                   
                    break;
                        
                }
                case 2:
                department="HR";
                System.out.println("1 for developer,2 for testers");
                int role=sc.nextInt();
                switch (role) {
                    case 1:
                        role="recruiter";
                        
                    break;
                    case 2:
                        role="payroll";
                      
                    break;
                        
                }
                case 3:
                department="Finance";
                System.out.println("1 for developer,2 for testers");
                int role=sc.nextInt();
                switch (role) {
                    case 1:
                        role="accountant";
                       
                    break;
                    case 2:
                        role="auditor";
                        
                    break;
                        
        }
        break;
    }
    System.out.println("Department: " + department);
System.out.println("Role: " + role);

    
}

}






