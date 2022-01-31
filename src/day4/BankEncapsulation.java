package day4;

public class BankEncapsulation {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.setAccountNumber("1");
        account1.setAccountHolderName("ABC");
        account1.deposit(500);
//        account1.accountNumber = "1";
//        account1.accountHolderName = "ABC";
//        account1.accountBalance = 500;

        Account account2 = new Account();
        account2.setAccountNumber("2");
        account2.setAccountHolderName("Ram");
        account2.deposit( 20000);
//        account2.accountNumber = "2";
//        account2.accountHolderName = "Ram";
//        account2.accountBalance = 1000;

        System.out.println("**********************Before Transfer******************");
        System.out.println("Account 2: " + account2.getAccountBalance());
        System.out.println("Account 1: " + account1.getAccountBalance());


        // Transferring balance (from A2 to A1 amount 500)
        // account2.accountBalance = account2.accountBalance - 500;
        // account1.accountBalance = account1.accountBalance + 500;

//        account2.setAccountBalance(account2.getAccountBalance()-500);
//        account1.setAccountBalance(account1.getAccountBalance()+500);
        account1.transferBalance(account2, account1, 1000);

        System.out.println("**********************After Transfer******************");
//        System.out.println("Account 2: " + account2.accountBalance);
//        System.out.println("Account 1: " + account1.accountBalance);
        System.out.println("Account 2: " + account2.getAccountBalance());
        System.out.println("Account 1: " + account1.getAccountBalance());

        // interest calculation
        account1.addInterest(account1);
    }
}
