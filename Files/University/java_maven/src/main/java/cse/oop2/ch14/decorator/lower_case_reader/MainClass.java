/*
Date : 21.12.02
Title : 14장 파일 입출력
Project : 줄 단위로 읽는 파일 입출력
 */

package cse.oop2.ch14.decorator.lower_case_reader;

import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        int c;
        {
            try { //InputStream <- FileInputStream <- BufferedInputStream 상속
                Reader is = new LowerCaseReader(
                        new BufferedReader(
                                new FileReader("C:\\Temp\\test.txt")));
                while ((c = is.read()) >= 0) { //-1 = EOF
                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println("예외 오류가 발생하였습니다 : " + ex);
            }
        }
    }
}
