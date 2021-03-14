package com.cjhedu.afternoon;

/**
 * 编写Doctor类{name,age,job,gender,sal}相应的getter和setter方法，5各参数的构造器，重写父类(Object)的 equals方法
 * public boolean equals(Object obj),并且判断测试类中创建的两个对象是否相等。相等就判断属性是都相等
 * author：phil
 */
public class homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 23, "医生", '男', 30000);
        Doctor doctor2 = new Doctor("jack", 23, "医生", '男', 30000);
        System.out.println(doctor1.equals(doctor2));//比较的是内容是否相等
        System.out.println(doctor1==doctor2);//比较的是地址是否相等

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                ", sal=" + sal +
                '}';
    }


    public boolean equals(Object obj){
        //判断两个对象是否相等
        if(this == obj){
            return true;
        }
        //判断obj 是否是Doctor类型或者子类
        if (!(obj instanceof Doctor)){
            return false;
        }
        //向下转型，因为obj的运行类型是Doctor或者子类型

        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name)&&this.age==doctor.age&&this.gender==doctor.gender&&this.job.equals(doctor.job)&&this.sal==doctor.sal;

    }
}