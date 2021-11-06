package cse.oop2.ch07.overridingTest;
public class Human {
    String name;
    int age;

    public Human(){}
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.printf("이름 : %s, 나이 : %d, ", name, age);
    }
}
