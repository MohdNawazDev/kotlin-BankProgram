    package com.example.bankprogram

    fun main(){

        var MohdNawazAccount = BankProgram("Mohd Nawaz", 2389022.45);
        println("${MohdNawazAccount.accountHolderName} this Amount: ${MohdNawazAccount.balance} Deposited in your account");

        MohdNawazAccount.depositMoney(200.00);
        MohdNawazAccount.withDrawMoney(400.00);
        MohdNawazAccount.showTransactionHistory();
        MohdNawazAccount.printAccountBalance();
    }