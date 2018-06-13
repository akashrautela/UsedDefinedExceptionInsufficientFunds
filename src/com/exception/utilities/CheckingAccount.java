package com.exception.utilities;
import com.exception.UserDefinedException.InsufficientFundsException;

public class CheckingAccount {
    private double balance;
    private int acno;
    public CheckingAccount(int acno){
        this.acno=acno;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(balance>=amount){
            balance -=amount;
        } else{
            double needs=amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getAcno(){
        return acno;
    }

}
