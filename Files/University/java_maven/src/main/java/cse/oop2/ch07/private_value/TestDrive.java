/*
Date : 21.11.06
Title : 7장 상속과 다형성
Project : 상속
 */
package cse.oop2.ch07.private_value;
public class TestDrive {
    public static void main(String[] args){
        Derived d1 = new Derived();
        System.out.printf("d1 number = %d%n", d1.getNumber());

        Derived d2 = new Derived();
        d2.setNumber(100);
        System.out.printf("d2 number = %d%n", d2.getNumber());
    }
}
