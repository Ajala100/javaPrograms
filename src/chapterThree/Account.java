package chapterThree;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance){
        this.accountName = accountName;
        if(balance < 0.0)
            throw new IllegalArgumentException("balance can not be less than zero");
        else {this.balance = balance;}
    }

    public void deposit(double depositAmount){
        if(depositAmount < 0.0)
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        else{ balance += depositAmount;}
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amountToWithdraw){
        if (amountToWithdraw > balance)
            throw new IllegalArgumentException("Withdrawal amount exceeded account balance");
        else{ balance -= amountToWithdraw;}
    }

    public void setName(String name) {
        this.accountName = name;
    }

    public String getName(){
        return accountName;
    }

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s account's balance is: %.2f", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
