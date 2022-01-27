package day4;

public class Account {
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

     public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
     }

    public static void transferBalance(Account fromAccount, Account toAccount, double amountToBeTransferred){
        //TODO "check if sufficient balance to be transferred is available or not"
        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-amountToBeTransferred);
        toAccount.setAccountBalance(toAccount.getAccountBalance()+amountToBeTransferred);

    }
}
