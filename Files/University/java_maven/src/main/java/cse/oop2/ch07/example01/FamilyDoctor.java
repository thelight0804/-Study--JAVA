package cse.oop2.ch07.example01;
public class FamilyDoctor extends Doctor{ //extends : 확장한다 (C++의 ':' 개념)
    boolean makeHouseCalls;

    public FamilyDoctor(boolean makeHouseCalls, boolean worksAtHospital) {
        super(worksAtHospital); //super : 부모클래스의 객체를 나타낸다
        this.makeHouseCalls = makeHouseCalls;
    }
    public void giveAdvice(){
        System.out.println("집에서 필요한 조언을 합니다.");
    }
}
