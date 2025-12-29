import java.util.Scanner;
public class VowelOrConsonent{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter num: ");
        char c = sc.next().charAt(0);
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            System.out.println("The given number is vowel");
        }
        else{
            System.out.println("The given number is consonent");
        }
    }
}