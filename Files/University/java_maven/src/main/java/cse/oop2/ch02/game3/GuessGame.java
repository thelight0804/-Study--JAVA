package cse.oop2.ch02.game3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GuessGame {
    private int marchinGeneratedNumber; //컴퓨터가 정한 난수값
    private int userGuessNumber = -1;
    public static final int MAN_COUNT =5; //static : 객체 생성 없이 사용 가능 / final : 바꿀 수 없다
        
        public void getUserInput() throws IOException{ //플레이어의 입력
        String inputLine; //입력한 값
        boolean rightNumberFormat = false;
        System.out.print("0~9까지의 숫자를 입력해 주세요 : ");
        
        do{ //무조건 한번은 실행한다
                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
                /*System.in : 입력
                InputStreamReader : (System.in)을 읽는다
                BufferedReader : 줄 단위로 읽는다
                */
                inputLine = is.readLine(); //Enter 단위로 읽어 inputLine 변수에 저장한다

                //STRING.matches("정규화") : STRING이 "정규화"에 적합한지 확인한다
                if(inputLine.matches("[0-9]")){ //입력한 수가 0~9일 때
                    this.userGuessNumber = Integer.parseInt(inputLine); //Integer.parseInt(STRING) : String inputLine을 int로 변환한다
                    rightNumberFormat = true;
                } //if(inputLine.matches("[0-9]")) 종료
                else{  System.out.println("-오류! 0~9까지의 숫자만 입력해 주세요.-");  }

            } while(!rightNumberFormat); //do 종료
        } //getUserInput() 종료
        
        private void generateRandomNumber(){ //난수 값 생성
            this.marchinGeneratedNumber = (int) (Math.random() * 10);
        } // generateRandomNumber() 종료
        
        
        
        public void startGame() throws IOException{
            int count = 0; //게임 횟수
            boolean matched = false; //정답 여부
            
            System.out.println("**숫자 맞추기 게임]** - 랜덤값으로 정해진 0~9를 맞춰보세요");
            System.out.println("[Game Start!]\n");
            
            generateRandomNumber(); //난수 값 생성
            
            while(!matched && count <MAN_COUNT ){ //못 맞추거나 5번의 기회동안
                getUserInput(); //플레이어가 입력 한다
                if(userGuessNumber == marchinGeneratedNumber){ matched = true; }
                else { count++; } //틀리면 횟수를 추가한다
            } //while 종료
            
            if(count < MAN_COUNT || matched){
                System.out.println("[당신이 이겼습니다!]");
            }
            else{
                System.out.println("[컴퓨터가 이겼습니다ㅠ]");
            }
            
        } //startGame() 종료
} //class 종료
