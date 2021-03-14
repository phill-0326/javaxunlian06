package com.cjhedu.afternoon;

public class Manager extends Employee{
    private double bonus ;

    public Manager(String name, double salary, int daytime, double bonus) {
        super(name, salary, daytime);
        this.bonus = bonus;
    }

    @Override
    public String print() {
        System.out.println("管理人员基本信息如下：");
       return super.print() + "工资：" + (bonus+getSalary()*getDaytime()*1.2) ;
    }
}
