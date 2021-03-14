package com.cjhedu.afternoon;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
    }

}
