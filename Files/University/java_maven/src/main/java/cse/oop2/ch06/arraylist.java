/*
Date : 21.10.22
Title : 6장 ArrayList
Project : ArrayList
 */
package cse.oop2.ch06;

import java.util.ArrayList; //ArrayList API

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> menu = new ArrayList<String> (); //String menu ArrayList 객체 생성
        String pizza = new String("피자");
        menu.add(pizza); //ArrayList에 데이터 추가

        String Chicken = new String("치킨");
        menu.add(Chicken); //ArrayList에 데이터 추가

        String pig = new String("족발");
        menu.add(pig); //ArrayList에 데이터 추가

        for(int i=0;i<menu.size();i++){ //향상된 for문은 배열만 가능
            System.out.println(i+1 + ". " + menu.get(i));
        }
    }
}
