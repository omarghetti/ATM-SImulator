package com.company;

public class User {
    private String firstName;
    private String lastName;
    private int accountNumber;

    public User() {
        firstName = "John";
        lastName = "Doe";
        accountNumber=1234567;
    }

    public User(String firstName, String lastName,int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber=accountNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
