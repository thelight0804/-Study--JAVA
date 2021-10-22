//임시(테스트)용으로 실행할 클래스
package cse.oop2.ch05.simpledotcom;
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); //SimpleDotCom 객체 생성
        int[] locations = {2,3,5}; //위치
        dot.setMonster(locations); //위치 생성
        String userGuess = "2"; //2 입력
        String result = dot.check(userGuess); //2 반영
    }
}
