package com.BillZ;

/**
 * Created by Bill on 5/16/17.
 * class's act as Objects, functions defined in them become methods
 */

public class BankAccount {


    //these variables are Fields. They are attributes of the object
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    //this is a constructor - its run when a new instantiation of the class is invoked
    public BankAccount(){
        //this is to set up default fields when an empty constructor is called
        this(555, 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty Constructor called");
    }


    //overloading the constructor by using with different amount of parameters
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Account constructor with paramaters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;

    }



    // these are setters and getters, allowing the fields to be updated and called
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    //method for depositing money
    public double deposit(double money){
        if (money > 0){
            this.balance += money;
        }
        return balance;

    }


    //method for withdrawling money
    public double withdrawl(double money){
        if (this.balance > 0 && this.balance > money){
            this.balance -= money;
            return this.balance;
        }else{
            System.out.println("You have insufficient funds for this transaction");
        }
        return this.balance;
    }

}
