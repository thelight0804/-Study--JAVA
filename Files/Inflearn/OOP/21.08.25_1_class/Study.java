//21.08.25 / class 정의
class SCV{
    //속성 (특징)
    int price; //가격
    int year; //년도
    String color; //색상
    
    //메서드
    void move(){ System.out.println("SCV is moving"); }
    void dig(){ System.out.println("SCV is digging a Mineral"); }
    void build(){ System.out.println("SCV is building"); }
}
public class Study{
    public static void main(String[] args){
        SCV scvFirst = new SCV(); //scvFirst 객체 생성
        System.out.println(scvFirst); //scvFirst의 주소값
        
        scvFirst.price = 5000000;
        scvFirst.year = 1998;
        scvFirst.color = "red";
        
        System.out.println(String.format("%,d", scvFirst.price));
        //String.format("%,d", scvFirst.price) : 정수 타입에 넣을 단위( , )와 VALUE
        System.out.println(scvFirst.year);
        System.out.println(scvFirst.color);
        
        scvFirst.move();
        scvFirst.dig();
        scvFirst.build();
    }
}
/*
- OOP : 객체 지향 프로그래밍
- class 객체는 사람들이 주문을 넣는 과정을 잘 생각해보면 답은 쉽게 나온다
- class는 객체의 "특징"과 "동작"에 많은 시간을 들이고 집중하면서 설계를 하게 된다
    객체의 특징 = 속성(attribute)
    객체의 동작 = 메서드(method) (class 내의 함수)
*/