import java.util.*;  
public class BankingSystem {
    public static void main(String[] args) {

    
        
    }
}
interface BankOperations{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
abstract class Account{
    private int accNo;
    private String name;
    private double balance;
    public void setAccNo(int accNo){

        this.accNo=accNo;
    }
    public int getAccNo(){
        return accNo;
    }
    public void setName(String n){
        this.name=n;

    }
    public String getName(){
        return name;
    }
    public void setBal(double balance){
        this.balance=balance;
    }
    public double getBal(){
        return balance;
    }
}
class SavingsAccount extends Account implements BankOperations{
    public SavingsAccount(int accNo,String name,double balance){
        super(accNo,name,balance);
        
    }
    void deposit(double amount){
        setBal(getBal()+amount);
    }
    void withdraw(double amount){
        setBal(getBal()-amount);
    }
    void checkBalance(){
        System.out.println("Check Balance: "+getBal());
    }


}
class CurrentAccount extends Account implements BankOperations{
    public CurrentAccount(int accNo,String name,double balance){
        super(accNo,name,balance);

    }
    void deposit(double amount){
        setBal(getBal()+amount);
    }
    void withdraw(double amount){
        setBal(getBal()-amount);
    }
    void checkBalance(){
        System.out.println("Check Balance: "+getBal());
    }

    
}