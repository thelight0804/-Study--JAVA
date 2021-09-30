/*
날짜 : 21.09.30
제목 : 2장 클래스와 객체_p.72
주제 : 숫자 맞추기 게임
*/
//GuessGame 객체를 이용하여 Game을 플레이하는 main역할

package cse.oop2.ch02.game2;
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
