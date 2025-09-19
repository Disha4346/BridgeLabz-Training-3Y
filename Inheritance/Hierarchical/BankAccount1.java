class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
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
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account | Account No: " + getAccountNumber() +
                           " | Balance: " + getBalance() + " | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal exceeds limit of " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    public void displayAccountType() {
        System.out.println("Checking Account | Account No: " + getAccountNumber() +
                           " | Balance: " + getBalance() + " | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Account No: " + getAccountNumber() +
                           " | Balance: " + getBalance() + " | Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAccount1 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 10000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA456", 5000, 2000);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 25000, 12);

        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();

        checking.withdraw(2500); // should block as it exceeds limit
        checking.withdraw(1500); // allowed
    }
}
