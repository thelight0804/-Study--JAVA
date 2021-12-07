/*
Date : 21.12.07
Title : 14장 파일 입출력
Project : 단순 객체 저장
 */

package cse.oop2.ch14.decorator.save_success;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "scores.ser"; //src가 있는 java_maven 폴더에 해당 파일이 있어야 한다
        String fileDir = System.getProperty("user.dir") + File.separator + "src/main/java/cse/oop2/ch14/decorator/save_success".replace(("/"), File.separator);
        /*
        getProperty : 현재 디렉토리 지정
         File.separator : "\\" 대신 "/"로 지정
         replace(("/"), File.separator : 상대경로로 지정한 "/"을 "\\" 대신 인식
         */
        Score score1 = new Score("박상현", 95);
        Score socre2 = new Score("김온유", 99);

        //객체 쓰기
        FileOutputStream fos = new FileOutputStream(fileDir + File.separator + fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(score1);
        oos.writeObject(socre2);
        oos.close();

        //객체 읽기
        FileInputStream fis = new FileInputStream((fileName));
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream((fileName)));
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Score> scores = new LinkedList<>();
        scores.add((Score) ois.readObject());
        scores.add((Score) ois.readObject());
        //Object 객체를 Score로 형변환

        for(var score : scores)
            System.out.println(score.getName() + " : " + score.getName());
        oos.close();
    }
}


