package com.cjhedu.afternoon;

public class teacher extends Teacher{
    public teacher(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        System.out.println("这是讲师的信息：");
        return super.introduce();
    }
}
