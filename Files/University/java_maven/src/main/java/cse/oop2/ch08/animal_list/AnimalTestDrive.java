/*
Date : 21.11.11
Title : 8장 인터페이스와 다형성
Project : 추상 클래스 & 추상 메소드
 */
package cse.oop2.ch08.animal_list;
public class AnimalTestDrive {
    public static void main(String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();

        list.add(d);
        list.add(c);
        list.add(t);

        System.out.printf("동물이 모두 %d마리 있습니다%n", list.getNextIndex());
        for(int i=0;i<list.getNextIndex();i++){
            System.out.println(list.get(i).getClass().getName() + " : ");
            //getClass() : class 객체 리턴
            //getName() : 패키지명이 포함된 클래스명
            list.get(i).makeNoise();
            list.get(i).sleep();
            System.out.println();
        }
    }
}
