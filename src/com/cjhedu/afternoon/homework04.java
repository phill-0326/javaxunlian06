package com.cjhedu.afternoon;

/**
 * 通过继承实现员工工资核算打印功能
 * author：phil
 */
public class homework04 {
    public static void main(String[] args) {
        Employee employee1 = new Manager("jack",330,23,20000);
        Employee employee2 = new worker("tom",230,28);
        System.out.println(employee1.print());
        System.out.println(employee2.print());
    }
}

class Employee{
    private String name;
    private double salary;
    private int daytime;

    public Employee(String name, double salary, int daytime) {
        this.name = name;
        this.salary = salary;
        this.daytime = daytime;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDaytime() {
        return daytime;
    }

    public void setDaytime(int daytime) {
        this.daytime = daytime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", daytime=" + daytime +
                '}';
    }

    //打印工资方法
    public String print(){
        return "姓名："+ name +"工作天数："+daytime;
    }
}
