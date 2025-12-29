/*public class IFDMS{
    public static void main(String args[]){
        int a=12;
        if(a%2==0) {
            System.out.println("The given number is even number");
        }
        if(a%2!=0){
            System.out.println("The given number is odd number");
        }
    }
}
*/


//Write a jp check weather the given character is uppercase character or lowercase character or digit or special character

import java.util.Scanner;
public class IfElseif{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        char c = sc.next().charAt(0);

        
        if(Character.isUpperCase(c)) {
            System.out.println("Character is uppercase");
        
        }
        else if(Character.isLowerCase(c)){
            System.out.println("Character is LowerCase");
        }
        else if(c>='0' && c<='9'){
            System.out.println("It is a digit");

        }
        else{
            System.out.println("character is a special character");
        }
    }
}