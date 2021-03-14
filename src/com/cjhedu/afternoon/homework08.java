package com.cjhedu.afternoon;

/**
 * 存款问题：
 * 1）在上面的类的基础上扩展 新类CheckAccount对每次的存款和取款都收取1美元的手续费
 * 2）扩展钱一个练习的BankAccount类，新类SavingAccount每个月都产生利息（earnMonthInterest调用），
 * 并且每个月有三次的免手续费的存款和取款。在earnMonthInterest方法中调用并重新重置次数
 *
 * author：phil
 */
public class homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(20);
//        checkingAccount.withdraw(10);
//        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());

        //每次到月底就将次数置为3
        savingsAccount.earnMonthInterest();
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());


    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public BankAccount() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}