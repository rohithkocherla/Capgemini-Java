public class Program1 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Accc1354",5000);
        System.out.println("Initial Balance: "+b1.getB());
        b1.setB(-2000);
        b1.setB(8000);
        System.out.println("Updated Balance: "+b1.getB());

        
    }
}
class BankAccount{
    private String accNum;
    private double bal;

    public BankAccount(String accNum,double bal){
        this.accNum=accNum;
        this.bal=bal;
    }
    public String getA(){
        return accNum;
    }
    public double getB(){
        return bal;

    }

    public void setB(double bal){
        if(bal>0){
            this.bal=bal;
        }
        else System.out.println("Error: Balance must be positive.");
    }
}


