/*
Date : 21.10.18
Title : 5장 프로그램 만들기
Project : 닷컴 가라앉히기
 */
package cse.oop2.ch05.simpledotcom;
public class SimpleDotComGame {
    public static void main(String[] args) { //왜 이게 있어야 하지?????
        int count = 0; //플레이어가 추측한 횟수

        GameHelper helper = new GameHelper(); //GameHelper 객체 생성
        SimpleDotCom theDotCom = new SimpleDotCom(); //SimpleDotCom 객체 생성

        int randNum = 0;
        randNum = (int) (Math.random() * 5); //첫번째 DotCom 지정
        //System.out.format("(randomNumber = %s)%n", randNum);
        int[] location = {randNum, randNum + 1, randNum + 2}; //DotCom 지정
        System.out.printf("%d", randNum);
        theDotCom.setMonster(location);

        boolean alive = true; //몬스터가 살아있는 지 확인
        while(alive == true) { //살아있으면 반복
            String guess = helper.getUserInput("숫자를 입력해 주세요");
            String result = theDotCom.check(guess); //입력과 정답을 비교한다
            count++; //횟수 증가
            
            if(result.equals("물리침")){ //result가 "물리침" 이면 / equlas : String 비교
                alive = false;
                System.out.printf("%d번 시도 중", count);
            }
        } //while 끝
    }
}
