package com.cjhedu.afternoon;

public class worker extends Employee{
    public worker(String name, double salary, int daytime) {
        super(name, salary, daytime);
    }

    @Override
    public String print() {
        System.out.println("这是员工的基本信息：");
        return super.print()+"工资: "+(getSalary()* getDaytime());
    }
}
