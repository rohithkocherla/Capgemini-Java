import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        // Creating Savings Account
        SavingsAccount sa = new SavingsAccount(101, "Rohith", 5000);
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.checkBalance();

        System.out.println("------------------");

        // Creating Current Account
        CurrentAccount ca = new CurrentAccount(102, "Kumar", 10000);
        ca.deposit(5000);
        ca.withdraw(3000);
        ca.checkBalance();
    }
}

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

abstract class Account {
    private int accNo;
    private String name;
    private double balance;

    // Constructor
    public Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public void setBal(double balance) {
        this.balance = balance;
    }

    public double getBal() {
        return balance;
    }
}

class SavingsAccount extends Account implements BankOperations {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        setBal(getBal() + amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        setBal(getBal() - amount);
        System.out.println("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Savings Account Balance: " + getBal());
    }
}

class CurrentAccount extends Account implements BankOperations {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        setBal(getBal() + amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        setBal(getBal() - amount);
        System.out.println("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Account Balance: " + getBal());
    }
}
