package bankingapplication3;

public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void listAccounts() {

    }

    public void openAccount(Account accout) {

    }

    public void closeAccout(int number) {

    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public Account getAccount(int number) {
        String accountname = "aaaa";
        double balance = 500;
        Account account = new Account(number, accountname, balance);
        return account;
    }
}
