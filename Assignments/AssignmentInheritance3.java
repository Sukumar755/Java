package Assignments;
/*3. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
if the account balance falls below one hundred.*/

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance of 100 must be maintained.");
        }
    }
}

public class AssignmentInheritance3 {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(50);
        account1.deposit(200);
        account1.withdraw(50);

        System.out.println("\nSavings Account:\n");
        SavingsAccount savingsAccount = new SavingsAccount(200);
        savingsAccount.deposit(150);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(100);
    }
}