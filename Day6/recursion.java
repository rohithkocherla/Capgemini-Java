public class recursion{

    //print nums from 500 to 50 without using loops+
    public static void main(String[] args) {
        int a=500;
        recursionReverse(a);

    }
    public static void recursionReverse(int a) {
        if(a<50){
            return;
        }
        System.out.println(a);
        recursionReverse(a-1);
        
    }
}
