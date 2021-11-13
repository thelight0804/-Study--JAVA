//ArrayList 와 비슷한 역할을 하는 MyAnimalList 클래스
package cse.oop2.ch08.animal_list;


public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){ //객체 추가
        if(nextIndex<animals.length){
            animals[nextIndex] = a;
            System.out.printf("Animal[%d] 객체 추가 %n", nextIndex);
            nextIndex++;
        }
    }
    public Animal get(int i){ //객체 반환
        Animal a = null;
        if(i>=0&&i<nextIndex)
            a = animals[i];
        return a;
    }
    public int getNextIndex(){ //객체 Index 반환
        return nextIndex;
    }
}
