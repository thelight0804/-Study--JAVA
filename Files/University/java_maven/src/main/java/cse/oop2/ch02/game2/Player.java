//정답을 난수를 이용해 자동으로 기입해준다
package cse.oop2.ch02.game2;

public class Player {

    private 
        int number = 0; //Player가 선택할 숫자

    public 
        void guess() {
        number = new java.util.Random().nextInt(10); //0~10까지의 난수?
        //java.lang.Math.random()보다 java.util.Random().nextInt(10)을 사용하길 권장한다

        //System.out.printf("찍은 숫자 : &d%n", number);
    }

    int getNumber() {   return number;   } //number 리턴
}
