package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User userInfo =new User("Omar","Ghetti",345_456_657);
        Account bankAccount=new Account(15000, 375000, 73869, userInfo);
        ATM fremontATM=new ATM(23895);

        boolean isRunning=true;
        while (isRunning){
            System.out.println("Press 1 to insert card or 2 to exit:");
            int usrInput=PinVerifier.readNumber();
            if(usrInput == 2){
                isRunning=false;
                System.out.println("End of the program");
            }
            else if (usrInput != 1)
                System.out.println("Wrong selection try again1");
            else{
                fremontATM.insertCard();
                if (!PinVerifier.pinVerify(bankAccount.getPinNumber())){
                    isRunning=false;
                    System.out.println("Maximum of 3 wrong pin entries reached, card disabled!");
                    fremontATM.removeCard();
                }
                else {
                    System.out.println("Select Operations");
                    boolean isUserActive=true;
                    while(isUserActive){
                        System.out.println("Press 1 to see your checkings, Press 2 to see your savings, press 3 to forfeit the operation");
                        int accountType=PinVerifier.readNumber();
                        if (accountType==3){
                            isUserActive=false;
                            fremontATM.removeCard();
                            System.out.println("Operation Completed!");
                        }
                        else
                        {
                            System.out.println("Select one: Balance: 1, Deposit: 2, Withdraw: 3");
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
