package com.cjhedu.afternoon;

/**
 * 定义一个Person类{name，age，job}初始化Person对象数组，
 * 有3个person对象并按照age从大到小排序，使用冒泡排序
 * author：phil
 */
public class homework01 {
    public static void main(String[] args) {
        Person [] p = new Person[3];
        p[0] = new Person("jack",12,"学生");
        p[1] = new Person("smith",50,"老师");
        p[2] = new Person("milan",34,"程序员");

        //冒泡排序

       // int max = 0;
        Person temp = null;//这个变量是接受的String类型的，肯定是不能把他变成int类型
        for (int i = 0; i < p.length-1; i++) {
            for (int j = 0; j < p.length-1-i; j++) {
                if (p[i].getAge()<p[i+1].getAge()){
                    //是整个数组的位置交换，年龄从大到小排序
                    temp = p[i];
                    p[i] = p[i+1];
                    p[i+1] = temp;
                }
            }
        }

        //遍历数组
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}



class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}