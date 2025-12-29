
import java.util.Scanner;
public class Fruits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fruit: ");
        String fruit=sc.nextLine();

        if(fruit.equals("Apple")){
            System.out.println("Apples are rich in fibre and vitaminC");
        }
        else  if(fruit.equals("Banana")){
            System.out.println("Bananas are the great source of potassium");
        }
        else if(fruit.equals("Mango")){
            System.out.println("Mangos are the king of fruits.");

        }
        else if(fruit.equals("Oranges")){
            System.out.println("Oranges are packed with vitamin-C.");

        }
        else{
            System.out.println("Sorry,I dont have information about that fruit.");
        }
    }
    
}
