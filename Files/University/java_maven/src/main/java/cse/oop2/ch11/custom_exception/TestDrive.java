/*
Date : 21.11.25
Title : 11장 예외 처리_PPT 강의자료
Project : 사용자 정의 예외
 */
package cse.oop2.ch11.custom_exception;

public class TestDrive {
    public static void main(String[] args) {
        MySum sum = new MySum();

        sum.setN(-5); //n을 -5로 지정
        //sum.setN(10);
        int result = -1;

        try {
            result = sum.getSum(); //1~n까지의 덧셈
            System.out.print("계산 완료 : ");
        } catch (InputRangeException ex) { //getSum()에서 예외를 던지면
            System.out.println("예외 발생 :" + ex.getMessage()); //예외도 클래스이므로 메소드 사용 가능
        }

        System.out.printf("n = %d, result=%d%n", sum.getN(), result);
    }
}
