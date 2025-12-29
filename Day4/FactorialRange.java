//WAJP TO PRINT FACTORIAL OF ALL NUMS FROM RANGE 1 TO 10
public class FactorialRange {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            int factorial=1;
            
        for(int j=1;j<i;j++){
            factorial = factorial*j;
        }
        System.out.println("factorial of " + i + " is: " + factorial);
        }
    }
}
