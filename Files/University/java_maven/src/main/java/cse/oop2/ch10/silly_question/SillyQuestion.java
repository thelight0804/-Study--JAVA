package cse.oop2.ch10.silly_question;


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

class Duck{
    public Duck(){ System.out.println("Duck 객체 생성!"); }
}
