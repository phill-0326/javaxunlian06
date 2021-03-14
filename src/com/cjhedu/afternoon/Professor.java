package com.cjhedu.afternoon;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        System.out.println("这是教授的信息：");
        return super.introduce();
    }
}
