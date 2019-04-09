package week3;

public class MyBankProgram {
    public static void main (String [] args){
        BankAccount account = new BankAccount(0);
        account.startDeposit();
//        account.deposit(500);
        System.out.println("your balance is " + BankAccount.balance );
        double interest = account.calcInterest();

        System.out.println("The interest due on your account is: " + interest);

        account.deposit(interest);

        account.displayBalance();

    }
}
