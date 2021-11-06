package cse.oop2.ch07.overloadingTest;

public class Calculator {
    void sum(int a, int b){
        int sum = a+b;
        System.out.println("sum : a+b = "+sum);
    }
    void sum(String c, String d){
        System.out.println("sum : c+d = "+c+d);
    }
}
