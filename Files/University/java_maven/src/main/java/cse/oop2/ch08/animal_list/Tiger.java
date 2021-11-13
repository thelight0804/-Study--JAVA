package cse.oop2.ch08.animal_list;

public class Tiger extends Animal{

    @Override //추상 메소드 makeNoise 오버라이딩
    public void makeNoise() {
        System.out.println("토라도라!");
    }
}
