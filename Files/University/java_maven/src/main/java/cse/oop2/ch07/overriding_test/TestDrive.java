/*
Date : 21.11.06
Title : 7장 상속과 다형성
Project : 오버라이딩
 */
package cse.oop2.ch07.overriding_test;

public class TestDrive {
    public static void main(String[] args){
        Job Park = new Job("박상현", 23, "대학생");
        Park.info(); //Job.info 호출
        Park.infoPlus();
    }
}
