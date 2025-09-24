import java.util.ArrayList;
import java.util.List;

// Account class
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

// Customer class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association: customer has accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Accounts of " + name + ":");
        for (Account acc : accounts) {
            System.out.println(" - " + acc.getAccountNumber() + " : Balance = " + acc.getBalance());
        }
    }
}

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Add customer to bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " is now a customer of " + bankName);
    }

    // Open account for a customer
    public void openAccount(Customer customer, String accNumber, double initialDeposit) {
        Account newAccount = new Account(accNumber, initialDeposit);
        customer.addAccount(newAccount);
        System.out.println("Opened account " + accNumber + " for " + customer.getName());
    }
}

// Main class
public class BankAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");

        // Create customers
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        // Add customers to bank
        bank.addCustomer(c1);
        bank.addCustomer(c2);

        // Open accounts
        bank.openAccount(c1, "A101", 5000);
        bank.openAccount(c1, "A102", 10000);
        bank.openAccount(c2, "B201", 2000);

        // Deposit and Withdraw
        c1.viewBalance();
        c2.viewBalance();
    }
}
