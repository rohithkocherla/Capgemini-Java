import java.util.Scanner;
public class CheckCh {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter character: ");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("It is a UpperCase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("It is a LoweCase");
        }
        else{
            System.out.println("digit");
        }

    }
}
