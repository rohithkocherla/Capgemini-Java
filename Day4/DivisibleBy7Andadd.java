public class DivisibleBy7Andadd {
    public static void main(String args[]){
        
        int sum=0;
        for(int i=100;i>=50;i--){
            if(i%7==0){
                sum+=i;
                System.out.print(i+" ");
            } 
        }
        System.out.println();
        System.out.print(sum+" ");
    }
}
