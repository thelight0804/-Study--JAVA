/*
Date : 21.11.06
Title : 7장 상속과 다형성
Project : 오버로딩
 */
package cse.oop2.ch07.overloadingTest;
public class TestDrive {
        public static void main(String[] args){
                Calculator a = new Calculator();
                a.sum(5, 10); //void sum(int a, int b) 호출
                a.sum("가", "나"); //void sum(String c, String d) 호출
        }
}
