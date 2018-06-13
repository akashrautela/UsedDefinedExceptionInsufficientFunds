package com.exception.controller;
import com.exception.utilities.*;
import com.exception.UserDefinedException.InsufficientFundsException;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Account Number : ");
        int acno = sc.nextInt();

        CheckingAccount c = new CheckingAccount(acno);
        System.out.println("Enter Amount You want to deposit :  ");
        double amnt = sc.nextDouble();
        c.deposit(amnt);
        try{
            System.out.println("Enter amount you want to withdraw : ");
            amnt = sc.nextDouble();
            c.withdraw(amnt);
           // System.out.println("withdrawing rs 12000 : ");
           // c.withdraw(12000);
        } catch(InsufficientFundsException e){
            System.out.println("SORRY INSUFFICIENT BALANCE, YOU ARE SHORT OF rs  "+e.getAmount());
        }

    }
}
