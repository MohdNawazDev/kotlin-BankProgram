package com.example.bankprogram

import java.nio.DoubleBuffer

class BankProgram (var accountHolderName: String, var balance : Double) {

    private val TransationsHistory = mutableListOf<String>()

    fun depositMoney(amount : Double){

       if(amount > 0){
           balance += amount;
           TransationsHistory.add("$accountHolderName deposited $$amount");
           println("Successfully deposited $amount. New balance: $balance");
       }else{
           println("Deposited Amount should be positive");
       }
    }

    fun withDrawMoney(amount: Double){
        if(amount <= 0){
            println("Withdrawal Amount cannot be negative")
        }
        else if(amount > balance){
            println("Your balance is to low. Current balance:  $$balance");
        }else{
            balance -= amount;
            TransationsHistory.add("$accountHolderName withdraw this $$amount");
        }
    }


    fun printAccountBalance(){
        println("$accountHolderName's current balance is: $balance");
    }

    fun showTransactionHistory(){

        println("Transaction history for $accountHolderName");
        for(transaction in TransationsHistory){
            println("$transaction");
        }
    }
}