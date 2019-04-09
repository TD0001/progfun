package week3;

import java.util.Scanner;

public class BankAccount {
    final double INTEREST_RATE = 0.1;
    public static double balance;
    BankAccount(double theBalance){

        balance = theBalance;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    double calcInterest(){
        double interest = balance * INTEREST_RATE;
        return interest;
    }
    void displayBalance(){
        System.out.println("The balance of your account is now: " + balance);
    }
    void withdraw(double amount){
        balance = balance - amount;
    }
    void getLoginInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = in.next();
        System.out.println("enter your PIN: ");
        int pin = in.nextInt();
    }
    void startDeposit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the deposit: ");
        double amount = in.nextDouble();
        balance = balance + amount;

    }
    void addBonus(double amount){

    }
    void addInterest(){

    }

}
