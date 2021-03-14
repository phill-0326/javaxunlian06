package com.cjhedu.afternoon;

public class AssistantProfessor extends Teacher{
    public AssistantProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        System.out.println("这是副教授的信息：");
        return super.introduce();
    }
}
