package cse.oop2.ch10.silly_question;
/*
Date : 21.11.18
Title : 10장 정적 변수, 정적 메소드_p.309
Project : 정적 클래스 (static)
 */
public class SillyQuestion {
    public static void main(String[] args){
        test();
        SillyQuestion.test();
        SillyQuestion q = new SillyQuestion();
        q.test();
    }
    public static void test(){
        Duck d  = new Duck();
    }
}
