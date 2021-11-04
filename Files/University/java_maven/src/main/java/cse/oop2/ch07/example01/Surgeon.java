package cse.oop2.ch07.example01;
public class Surgeon extends Doctor{
    public Surgeon(boolean worksAtHospital) {
        super(worksAtHospital);
    }
    
    @Override
    public void treatPatient(){
        System.out.println("외과 수술을 합니다");
    }
     public void makeIncision(){
        System.out.println("살에 칼이 들어갑니다.");
    }
}
