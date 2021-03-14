package com.cjhedu.afternoon.homework13;

import com.cjhedu.afternoon.homework13.Person;

public class Student extends Person {
    private int stu_id;

    public Student(String name, int age, char gender, int stu_id) {
        super(name, age, gender);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩足球");
    }

    public void study(){
        System.out.println("我承诺，我会认真上课！");
    }
}
