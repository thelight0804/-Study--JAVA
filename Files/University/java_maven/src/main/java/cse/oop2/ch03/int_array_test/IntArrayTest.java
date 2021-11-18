/*
Date : 21.10.12
Title : 3장 네 변수를 알라_6주차 강의 4
Project : 상수 (전역 변수)
 */
package cse.oop2.ch03.int_array_test;

public class IntArrayTest {

    public static final int MAX_NUM = 1000; //num의 배열 개수

    public static void main(String[] args) {
        int[] num;
        long sum = 0;

        num = new int[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) {
            num[i] = (int) (Math.random()*100); //랜덤값
            sum = sum+num[i];
        }
        System.out.println("평균 : " + (float) sum / MAX_NUM );
        //this.calculateSumUsingWrapper(num); -> error?
    }
}
