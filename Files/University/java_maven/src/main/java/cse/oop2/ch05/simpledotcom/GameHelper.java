//사용자로부터 입력 받는다
package cse.oop2.ch05.simpledotcom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GameHelper {
    //다른 수가 입력된 경우(예외) -1을 반환한다
    public String getUserInput(String prompt) {
        String inputLine = null; //String은 초기화를 해주어야 한다
        System.out.print(prompt + ": ");

        //예외처리 : 프로그램 실행시 발생할 수 있는 예외발생을 대비한 코드 (try-catch)
        try{ //예외발생할 가능성이 있다면
            //입력
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) //아무것도 입력하지 않으면
                return "-1";
        } //try 끝
        catch(IOException e){ //IOException e 예외가 발생했을 경우
            System.out.println("IOException: " + e);
        }

        if(inputLine != null && inputLine.matches("\\d")) //\\d : 0~9
            return inputLine;
        else
            return "-1";
    }
}
