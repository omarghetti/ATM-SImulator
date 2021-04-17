package com.company;

public class ATM {
    private int ID;
    private int balance;
    private boolean cardInserted;


    public ATM() {
        this.ID=12345;
        this.balance=10_000;
        this.cardInserted=false;
    }

    public ATM(int ID, int balance) {
        this.ID = ID;
        this.balance = balance;
        this.cardInserted=false;
    }


    public boolean isCardInserted(){
        return cardInserted;
    }
    public void insertCard(){
        cardInserted=true;
    }
    public void removeCard(){
        cardInserted=false;
    }


    private int getBalance() {
        return balance;
    }
    //transactions to/from the cash bin
    public void deposit(int amount){
        this.balance=+amount;
    }
    public void withdraw(int amount){
        if (amount > this.balance){
            System.out.println("The amount you selected is not available!");
        }
        else{
            balance=balance-amount;
        }
    }
}
