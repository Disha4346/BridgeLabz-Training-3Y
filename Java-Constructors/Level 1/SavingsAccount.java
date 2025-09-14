public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
