package com.cjhedu.afternoon.homework13;

public class homework13 {
    public static void main(String[] args) {

        Person[] persons = new Person[4];
        persons[0] = new Student("jack", 23, '男', 12);
        persons[1] = new Student("tom", 13, '男', 13);
        persons[2] = new Teachers("mary", 35, '女', 10);
        persons[3] = new Teachers("smith", 50, '女', 25);



        //初始化学生类调用方法
        Student student1 = new Student("jack", 23, '男', 12);
        System.out.println("学生信息如下：");
        System.out.println("姓名："+student1.getName());
        System.out.println("年龄："+student1.getAge());
        System.out.println("性别："+student1.getGender());
        System.out.println("学号："+student1.getStu_id());
        student1.play();
        student1.study();
        //初始化教师类调用方法
        System.out.println("-------------------------------");
        Teachers teachers = new Teachers("smith", 50, '女', 25);
        System.out.println("老师信息如下：");
        System.out.println("姓名："+teachers.getName());
        System.out.println("年龄："+teachers.getAge());
        System.out.println("性别："+teachers.getGender());
        System.out.println("工龄："+teachers.getWork_age());
        teachers.play();
        teachers.tech();

        homework13 homework13 = new homework13();
        homework13.bubbleSort(persons);
        //遍历数组输出
        System.out.println("=====排序后的数组=====");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        System.out.println("================");
        for (int i = 0; i < persons.length; i++) {
         homework13.test(persons[i]);
        }


    }

    public void test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        }else if (p instanceof Teachers){
            ((Teachers) p).tech();
        }else{
            System.out.println("do nothing....");
        }
    }

    //冒泡排序方法，完成年龄从高到低排序
    public void bubbleSort(Person[] persons){
    Person temp  = null;
    for (int i = 0; i < persons.length - 1; i++) {
        for (int j = 0; j < persons.length - 1 - i; j++) {
            //判断条件 按年龄从高到低排序
            if (persons[j].getAge() < persons[j + 1].getAge()) {
                temp = persons[j];
                persons[j] = persons[j+1];
                persons[j+1] = temp;
            }
        }
    }
}

}

