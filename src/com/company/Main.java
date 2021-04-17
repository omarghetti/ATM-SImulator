package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User userInfo =new User("Omar","Ghetti",345_456_657);
        Account bankAccount=new Account(15000, 375000, 73869, userInfo);
        ATM fremontATM=new ATM(23895,10000);

        boolean systemInTest=true;
        while (systemInTest){
            System.out.println("Press 1 to insert card or 2 to exit the program:");
            int usrInput=PinVerifier.readNumber();
            if(usrInput == 2){
                systemInTest=false;
                System.out.println("End of the program");
            }
            else if (usrInput != 1)
                System.out.println("Wrong selection try again1");
            else{
                //Since we don't have access to the ATM machine card insertion is modeled with if statements
                //and we are manually changing the cash bin's related method
                fremontATM.insertCard();
                //Allow three attempts to enter the correct pin number
                if (!PinVerifier.pinVerify(bankAccount.getPinNumber())){
                    systemInTest=false;
                    System.out.println("invalid entry!Exiting the program. Please remove your card");
                    fremontATM.removeCard();
                }
                else {
                    System.out.println("Welcome to your account");
                    boolean activeUser=true;
                    while(activeUser){
                        System.out.println("For Checking Account select 1 for Saving 2 or 3 to Exit");
                        int accountType=PinVerifier.readNumber();
                        if (accountType==3){
                            activeUser=false;
                            fremontATM.removeCard();
                            System.out.println("Thanks goodbye!");
                        }
                        else
                        {
                            System.out.println("Select from the menu: Balance: 1, Deposit: 2, Withdraw: 3");
                            int action=PinVerifier.readNumber();
                            if(action == 1){
                                bankAccount.displayBalance(accountType);
                            }
                            else  if(action == 2){
                                System.out.println("Enter the amount you are depositing");
                                int depositAmount=PinVerifier.readNumber();
                                bankAccount.deposit(accountType,depositAmount);
                                System.out.println("Account updated");
                                bankAccount.displayBalance(accountType);
                            }
                            else if (action == 3){
                                System.out.println("Enter the amount you are withdrawing");
                                int withdrawAmount=PinVerifier.readNumber();
                                bankAccount.withdraw(accountType,withdrawAmount);
                                System.out.println("Account updated");
                                bankAccount.displayBalance(accountType);

                            }

                        }


                    }



                }





            }

        }
    }
}
