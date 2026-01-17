

public class BankingManagementSystem {
    
  public static void main(String[] args) {

    Customer obj = new Customer(33,"Rohit","rohith@gmail.com");
    obj.displayCustomerInfo();

    Account a1 = new Account(5001,2500.50,obj);
    a1.displayAccountInfo();

    Transaction t1 = new Transaction(9001,a1,500.00,"2025-10-23");
    t1.displayTransactionInfo();
}

}
class Customer{
    int customerid;
    String name;
    String email;
    public Customer(int customerid,String name,String email){
             this.customerid=customerid;
             this.name=name;
             this.email=email;
    }
    public Customer(String name,String email){
        this.name=name;
        this.email=email;
    }
    public void displayCustomerInfo(){
        System.out.println("Customer Information:");
        System.out.println("Customer ID: "+customerid);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }

    }
class Account{
    int accnum;
    double bal;
    Customer c;
    public Account(int accnum,double bal,Customer c){
        this.accnum=accnum;
        this.bal=bal;
        this.c=c;
    }
    public Account (int accnum,Customer c){
            this.accnum=accnum;
            this.c=c;
    }
    public void displayAccountInfo(){
        System.out.println("Account Information:");
        System.out.println("Account Number: "+accnum);
        System.out.println("Balance: "+bal);
    }
    
}
class Transaction{
    int transactionid;
    Account acc;
    double amount;
    String date;
        
    public Transaction(int transactionid,Account acc,double amount,String d){
        this.transactionid=transactionid;
        this.acc=acc;
        this.amount=amount;
        this.date=d;
    }
    public Transaction(int transactionid,Account acc){
        this.transactionid=transactionid;
        this.acc=acc;
    }
    public void displayTransactionInfo(){
        System.out.println("transaction INformation:");
        System.out.println("Transaction ID: "+transactionid);
        System.out.println("Amount: "+amount);
        System.out.println("Date: "+date);
    }
}
class BMS{
    String bankName;
    int totalAccounts;
    int totaltrans;

public void displayBankInfo(){
    System.out.println("Bank Name: "+bankName);
    System.out.println("Total Accounts: "+totalAccounts);
    System.out.println("Total transactions: "+totaltrans);
}
}