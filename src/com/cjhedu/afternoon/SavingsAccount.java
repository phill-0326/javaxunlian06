package com.cjhedu.afternoon;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    int count = 3;

    @Override
    public void deposit(double amount) {
        if (count >0){
          super.deposit(amount);
        }else{
            super.deposit(amount -1);
        }
        count --;
    }

    @Override
    public void withdraw(double amount) {
       if (count > 0){
           super.withdraw(amount);
       }else{
           super.withdraw(amount +1);
       }
       count --;
    }



    public void earnMonthInterest(){
        count = 3;
        super.deposit(getBalance()*0.01);
    }

}
