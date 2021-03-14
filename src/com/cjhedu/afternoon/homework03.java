package com.cjhedu.afternoon;

/**
 * 编写老师类然后将各个属性输入三个级别的工资然后写一个调用的方法将老师的基本信息打印出来
 * author：phil
 */

public class homework03 {
    public static void main(String[] args) {
        Teacher t = new Professor("tom",23,"教授",1.3);
        System.out.println(t.introduce());
    }

}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public Teacher() {
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

    //introduce的方法
    public String  introduce(){
        return "姓名："+name+" 年龄："+age+" 职业："+post+" 基本工资："+salary;
    }
}