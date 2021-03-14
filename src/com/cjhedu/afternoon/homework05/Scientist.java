package com.cjhedu.afternoon.homework05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "bonus=" + bonus +
                '}';
    }

    @Override
    public void printSal() {
        System.out.println("全年工资：  姓名："+getName() +"年龄："+getAge()+"薪水："+(getBonus()+getSalary()));
    }
}
