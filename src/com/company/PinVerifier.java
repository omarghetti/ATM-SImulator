package com.company;

import java.util.Scanner;

public class PinVerifier {
    private static Scanner scanner = new Scanner(System.in);

    public static int readNumber() {
        return scanner.nextInt();
    }

    public static boolean pinVerify(int correctPin){
        int trials=0;
        boolean verified = false;
        System.out.println("Enter your pin number:");
        while ((trials<3) && (!verified))
        {
            int pinEntered=PinVerifier.readNumber();
            if (correctPin == pinEntered)
            {verified=true;}
            else{
                System.out.println("Wrong input try again!");
            }
            trials++;
        }
        return verified;
    }
}
