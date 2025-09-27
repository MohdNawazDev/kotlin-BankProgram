package com.example.bankprogram

import java.nio.DoubleBuffer

class BankProgram (var accountHolderName: String, var balance : Double) {

    private val TransationsHistory = mutableListOf<String>()



    init {

    }

    fun depositMoney(amount : Double){
        println("Enter much money you want to deposit..");
        balance += amount;
        TransationsHistory.add("$accountHolderName deposited $$amount")
    }

    fun withDrawMoney(amount: Double){

        if(balance < amount){
            println("Your balance is to low");
        }else{
            balance -= amount;
            TransationsHistory.add("$accountHolderName withdraw this $$amount");
        }


    }

    fun showTransactionHistory(history: String){

    }
}