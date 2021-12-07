/*
Date : 21.12.07
Title : 14장 파일 입출력
Project : 복합 객체 저장과 적재
 */
package cse.oop2.ch14.decorator.save_success2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class TestDrive {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        String fileName = "scores2.ser"; //src가 있는 java_maven 폴더에 해당 파일이 있어야 한다
        String fileDir = System.getProperty("user.dir") + File.separator + "src/main/java/cse/oop2/ch14/decorator/save_success2".replace(("/"), File.separator);
        System.out.println("file위치 : " + fileDir);

        Person p1 = new Person("박상현", "95");
        Person p2 = new Person("김온유", "99");
        Score score1 = new Score(p1, 95);
        Score socre2 = new Score(p2, 99);

        //객체 쓰기
        FileOutputStream fos = new FileOutputStream(fileDir + File.separator + fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(score1);
        oos.writeObject(socre2);
        oos.close();

        //객체 읽기
        FileInputStream fis = new FileInputStream((fileName));
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Score> scores = new LinkedList<>();
        scores.add((Score) ois.readObject());
        scores.add((Score) ois.readObject());
        //Object 객체를 Score로 형변환

        for(var score : scores)
            System.out.println(score.getPerson().getName() + " ( " + score.getPerson().getId() + ") : " + score.getNum());
        oos.close();
    }
}
