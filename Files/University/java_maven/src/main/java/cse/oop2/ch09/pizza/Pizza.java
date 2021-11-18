/*
Date : 21.11.13
Title : 9장
Project : 클래스와 메소드 구분
 */
package cse.oop2.ch09.pizza;
public class Pizza {
    public Pizza(){  System.out.printf("Pizza 기본 클래스 호출%n");  }
    public void Pizza(){System.out.printf("Pizza 메소드 호출%n");}

    public static void main(String[] args){
        Pizza P1 = new Pizza();
    } //main 끝
} //public class Pizza 끝

