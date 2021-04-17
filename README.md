# ATM-SImulator
Project for Bear Robotics SEI

# Requirements
At least the following flow should be implemented:

Insert Card => PIN number => Select Account => See Balance/Deposit/Withdraw



For simplification, there are only 1 dollar bills in this world, no cents. Thus account balance can be represented in integer.



Your code doesn't need to integrate with a real bank system, but keep in mind that we may want to integrate it with a real bank system in the future. It doesn't have to integrate with a real cash bin in the ATM, but keep in mind that we'd want to integrate with that in the future. And even if we integrate it with them, we'd like to test our code. Implementing bank integration and ATM hardware like cash bin and card reader is not a scope of this task, but testing the controller part (not including bank system, cash bin etc) is within the scope.



A bank API wouldn't give the ATM the PIN number, but it can tell you if the PIN number is correct or not.



Based on your work, another engineer should be able to implement the user interface. You don't need to implement any REST API, RPC, network communication etc, but just functions/classes/methods, etc.



You can simplify some complex real world problems if you think it's not worth illustrating in the project.

# Specifications
I implemented 4 classes to represent the flow requested by the task: Account, User, PinVerifier and ATM.

# User
Cointains basic informations about the bank account owner, like First Name, Last Name and the number of the account. getters and setters are implemented

# Account
defines two different types of bank account, one for savings and one for checking. getters and setters implemented

# PinVerifier
Class that implements a method to verify that the pin inserted by the user is correct

# ATM
Class that represents the real ATM

# IDE

project has been made with IntelliJ 2020.3 with java 1.8
