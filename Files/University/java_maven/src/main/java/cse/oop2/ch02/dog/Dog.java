/*날짜 : 21.09.24
제목 : 4주차 객체지향
*/
//Dog 클래스
package cse.oop2.ch02.dog;
public class Dog {
    int size;
    String breed;
    String name;
    
    public Dog(){ //기본 생성자
        this(10, "검정", "강아지");
    }
    //우클릭 - Insert Code - Constructor : 클래스 자동 초기화
    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    void bark(){
        System.out.println(name + " : 멍멍!");
    }
    
}
