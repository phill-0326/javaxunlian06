package com.cjhedu.afternoon.homework05;

public class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classDay=" + classDay +
                ", classSal=" + classSal +
                '}';
    }


    @Override
    public void printSal() {
        System.out.println("全年工资：  姓名："+getName() +"年龄："+getAge()+"薪水："+(getClassDay()*getClassSal()+getSalary()));
    }
}
