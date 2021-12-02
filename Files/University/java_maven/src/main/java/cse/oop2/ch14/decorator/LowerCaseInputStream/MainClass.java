package cse.oop2.ch14.decorator.LowerCaseInputStream;

import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        int c;
        {
            try { //InputStream <- FileInputStream <- BufferedInputStream 상속
                InputStream is = new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("C:\\Temp\\test.txt")));
                while ((c = is.read()) >= 0) { //-1 = EOF
                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println("예외 오류가 발생하였습니다 : " + ex);
            }
        }
    }
}
