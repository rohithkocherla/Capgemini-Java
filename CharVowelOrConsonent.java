import java.util.Scanner;

// import.java.util.Scanner;
public class CharVowelOrConsonent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Character: ");
        char ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println("Character is Uppercasevowel: ");
            }
            else {
                System.out.println("Character is Uppercaseconsonent");
            }
            

        }else{
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    System.out.println("Character is Lowercasevowel");

            }
            else{
                System.out.println("Character is Lowercaseconsonent");
            }

    }
}

}
