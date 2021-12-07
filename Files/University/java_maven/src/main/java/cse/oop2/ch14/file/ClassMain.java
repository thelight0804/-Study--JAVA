/*
Date : 21.12.07
Title : 14장 파일 입출력 p.486
Project : java.io.File 클래스
 */

package cse.oop2.ch14.file;

import java.io.File; //File 클래스 호출
import java.io.IOException;

public class ClassMain {
    public static void main(String[] args) throws IOException {
        //새 디렉토리(폴더) 생성
        File dir = new File("C:\\Temp\\Chapter14");
        dir.mkdir(); //새 폴더 생성

        //파일 읽기
        File file = new File("C:\\Temp\\Chapter14\\input.txt");
        file.createNewFile(); //새 파일 생성

        //디렉토리에 있는 파일 내용 출력
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            System.out.println("파일 내용");
            for (int i = 0; i < dirContents.length; i++)
                System.out.println(dirContents[i]);
        }
        System.out.println();

        //절대 경로 출력
        System.out.println("절대 경로 : " + dir.getAbsolutePath());

        //파일 또는 디렉토리 삭제
        boolean isDeleted = file.delete();
    }
}
