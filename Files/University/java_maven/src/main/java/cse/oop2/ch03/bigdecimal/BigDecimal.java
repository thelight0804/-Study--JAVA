/*
Date : 21.10.12
Title : 3장 네 변수를 알라_6주차 강의 3
Project : BigDecimal
 */
package cse.oop2.ch03.bigdecimal;

//BigDecimal을 사용하기 위한 import
import java.math.BigDecimal;

public class BigDecimal {
    public static void main(String[] args) {
        //BigDecimal : 매우 큰 수를 사용할 수 있는 클래스
        BigDecimal a = new BigDecimal("1000000000");
        BigDecimal b = new BigDecimal("123456.123456");
        System.out.println("a = " + a + " / b = " + b);
        
        BigDecimal result = a.add(b);
        System.out.printf("result = %s", result);
    }
}
