package com.cjhedu.afternoon.homework13;

import com.cjhedu.afternoon.homework13.Person;

public class Teachers extends Person {
    private int work_age;

    public Teachers(String name, int age, char gender, int work_age) {
        super(name, age, gender);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩象棋");
    }

    //study（）方法
    public void tech(){
        System.out.println("我承诺，我会好好学习！");
    }
}
