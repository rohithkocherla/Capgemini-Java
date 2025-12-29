public class methodCalculator {
    //wjp to create calculator class consist of 4 methods.
    //1.to add 3 variables
    //2.to multiply 3 variables.
    //3.to substract 4 variables
    //4.to add 2 variables.
    public static void main(String args[]){
    Add(10,20,30);
    Mul(1,2,3);
    Sub(20,10,5,2);
    AddString("Hello "," World");

}
public static void Add(int a,int b,int c){
    System.out.println(a+b+c);
}
public static void Mul(int a,int b,int c){
    System.out.println(a*b*c);
}

public static void Sub(int a,int b,int c,int d){
    System.out.println(a-b-c-d);
}
public static void AddString(String a,String b){
    System.out.println(a+b);
}
}