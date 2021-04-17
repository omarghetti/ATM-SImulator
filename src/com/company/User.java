package com.company;

public class User {
    private String name;
    private String surname;
    private final int accountNumber;

    public User(String name, String surname,int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.accountNumber=accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
