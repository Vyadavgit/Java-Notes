package day4;

public class Account {
    private final float INTEREST_RATE = 0.05F;

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // getters and setters fns
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

     public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
     }

     public double getAccountBalance(){
        return accountBalance;
     }

     private void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
     }

     public void deposit(double amount){
        this.accountBalance += amount;
     }

    public static void transferBalance(Account fromAccount, Account toAccount, double amountToBeTransferred){
        //TODO "check if sufficient balance to be transferred is available or not"
        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-amountToBeTransferred);
        toAccount.setAccountBalance(toAccount.getAccountBalance()+amountToBeTransferred);

    }

    // addInterest
    public void addInterest(Account account){
        double interest = (account.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Principal Amount: " + account.getAccountBalance());
        System.out.println("Interest Amount: " + interest);
        account.setAccountBalance(account.getAccountBalance()+interest);
        System.out.println("Account balance: " + account.getAccountBalance());
    }
}
