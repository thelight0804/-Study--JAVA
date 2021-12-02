package cse.oop2.ch14.decorator.resource;

import java.io.*;
import cse.oop2.ch14.decorator.LowerCaseReader.*;

public class TestDrive {
    public void go() {
        System.out.printf("%s.go() 읽음 : ", getClass().getSimpleName());
        //getResourceAsStream : 리소스를 이용한 파일 읽기
        //\src\main의 파일을 읽는다
        InputStream is = getClass().getResourceAsStream("/test2.txt"); //\가 아닌 /이다
        int c;
        try (Reader reader = new LowerCaseReader(new BufferedReader(new InputStreamReader(is)))) {
            while ((c = reader.read()) >= 0)
                System.out.print((char) c);
        } catch (IOException ex) { //catch에서 코드가 한 줄이라도 {}를 써야한다
            System.out.println("! 오류 발생 : " + ex.getMessage());
        } //try-catch 끝
    }
}



