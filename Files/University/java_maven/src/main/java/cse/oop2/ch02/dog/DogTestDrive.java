/*날짜 : 21.09.24
제목 : 4주차 객체지향
*/
//Main 클래스
package cse.oop2.ch02.dog;
public class DogTestDrive {
    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog(30, "갈색", "멍멍이");
        Dog d3 = new Dog();
            d3.name = "왈왈이";
            d3.size = 40;
        
        d1.bark();
        d2.bark();
        d3.bark();
    }
}
