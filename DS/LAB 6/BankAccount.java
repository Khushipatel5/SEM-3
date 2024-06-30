import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    
    
    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }
        public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(1546225, 51000.0, "ABC");
        accounts[1] = new BankAccount(1002564, 13000.0, "DEF");
        accounts[2] = new BankAccount(1002153, 80000.0, "GHI");
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Bank!");
        

        accounts[1].deposit(1000.0);
        
        
        accounts[2].withdraw(500.0);

        accounts[0].checkBalance();
        
        scanner.close();
    }
}
