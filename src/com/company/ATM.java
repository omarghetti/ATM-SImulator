package com.company;

public class ATM {
    private int ID;
    private boolean cardInserted;


    public ATM(int ID) {
        this.ID = ID;
        this.cardInserted=false;
    }


    public void insertCard(){
        cardInserted=true;
    }
    public void removeCard(){
        cardInserted=false;
    }

    public boolean isCardInserted() {
        return cardInserted;
    }

    public void setCardInserted(boolean cardInserted) {
        this.cardInserted = cardInserted;
    }

}
