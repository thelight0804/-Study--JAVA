package cse.oop2.ch10.practice_duck;
/*
Date : 21.11.18
Title : 10장 정적 변수, 정적 메소드_p.309
Project : 정적 메소드, 정적 변수 (static)
 */
public class Duck {
    private int size;
    private static int duckCount = 0; //static 정적 변수
    private int nth;

    private static Duck[] ducks; //static 배열

    public Duck(){
        this(10);
    } //기본 생성자

    public Duck(int size){ //매개변수 생성자
        this.size = size;
        nth = duckCount++;
    }

    @Override
    public String toString() {
        //StringBuilder : 선언 후 변경이 가능한 String 클래스
        StringBuilder sb = new StringBuilder();
        sb.append("나는 ");
        sb.append(nth);
        sb.append("번째 오리이며, ");
        sb.append("크기는 ").append(size).append("입니다");
        //"나는 ntr 번째 오리고 크기는 size 입니다"

        return sb.toString();
    }

    public static void initialize(){ //static 정적 함수
        ducks = new Duck[10];

        ducks[0] = new Duck();
        for(int i =1; i<ducks.length; i++){
            int size = (int)(Math.random()*20)+10; //10~30
            ducks[i] = new Duck(size);
        }
    }

    //main을 다른 클래스로 분리하면 initialize()가 오류가 난다
    public static void main(String[] args){
        initialize(); //static으로 객체없이 호출 가능
        for (Duck d : ducks) {
            System.out.println(d);
        }
    } //main(String[] args) 끝
} //class Duck 끝
