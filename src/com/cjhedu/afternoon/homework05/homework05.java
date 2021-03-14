package com.cjhedu.afternoon.homework05;

/**
 * 设计父类员工类。子类：工人类，农民类，教师类，科学家类，服务生类
 * 继承父类的打印全年的薪资方法
 */
public class homework05 {
    public static void main(String[] args) {
        Employee employee1 = new Peasant("jack",35,30000);
        Employee employee2 = new Worker("tom",23,30000);
        Employee employee3 = new Waiter("milan",37,30000);
        employee1.printSal();
        employee2.printSal();
        employee3.printSal();

        Teacher employee4 = new Teacher("mary",35,30000);
        employee4.setClassDay(20);
        employee4.setClassSal(300);
        employee4.printSal();

        Scientist employee5 = new Scientist("smith",35,30000);
        employee5.setBonus(300000);
        employee5.printSal();
    }
}
class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void printSal(){
        System.out.println("全年工资：  姓名："+name +"年龄："+age+"薪水："+salary);
    }
}