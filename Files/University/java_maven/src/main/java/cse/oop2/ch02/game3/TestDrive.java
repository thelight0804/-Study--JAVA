/*
날짜 : 21.09.30
제목 : 2장 클래스와 객체_5주차 강의 1
주제 : 숫자 맞추기 게임 (답 직접 입력)
 */

//throws IOException가 뭐지?
//TODO 어캐 쓰더라ㅠ
//이거 디버깅 어캐 함ㅠㅠㅠ
//왜 계속 첨에 실행한 패키지만 실행됌?
package cse.oop2.ch02.game3;

import java.io.IOException;

public class TestDrive {
    public static void main(String[] args) throws IOException{
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
