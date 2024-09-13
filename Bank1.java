
import java.util.HashMap;

public class Bank1 {
    private HashMap<String, Account1> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account1 newAccount = new Account1(accountNumber, accountHolder, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public Account1 getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void displayAllAccounts() {
        for (Account1 account : accounts.values()) {
            account.displayAccountDetails();
            System.out.println("---------------------------");
        }
    }
}

