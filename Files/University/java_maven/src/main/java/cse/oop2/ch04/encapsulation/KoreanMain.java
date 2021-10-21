/*
Date : 21.10.18
Title : 4장 객체의 행동_7주차 강의 1
Project : 캡슐화, 객체 배열
 */
package cse.oop2.ch04.encapsulation;
public class KoreanMain {
    public static void main(String[] args) {
        Korean[] human = new Korean[3]; //객체 배열 생성 / 각 human 배열에는 참조(공간)만 생성된 상태
        human[0] = new Korean(20000, "배틀크루저");
        human[1] = new Korean(5000, "시즈탱크");
        human[2] = new Korean(50, "마린");
        for(int i=0;i<human.length;i++){ //.length = 배열의 길이
            System.out.printf("이름 : %s, 재산 : %d\n", human[i].getName(), human[i].getMoney());
        }
        System.out.println("--------------------");
        for(int i=0;i<human.length;i++){
            human[i].rank();
        }
    }
}
