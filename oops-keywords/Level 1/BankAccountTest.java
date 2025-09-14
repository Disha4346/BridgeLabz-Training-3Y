public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "John Doe", 5000);
        BankAccount acc2 = new BankAccount(102, "Jane Smith", 10000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
