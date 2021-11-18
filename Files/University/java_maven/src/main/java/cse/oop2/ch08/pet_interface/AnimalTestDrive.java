package cse.oop2.ch08.pet_interface;
import cse.oop2.ch08.animal_list.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalTestDrive {
    public static void main(String[] args){
        List<Animal> list = new ArrayList<>();
        Dog d = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();
        list.add(d);
        list.add(c);
        list.add(t);

        System.out.printf("동물이 모두 %d마리 있습니다%n", list.size());
        for(var animal : list){
            System.out.println(animal.getClass().getName() + " : ");
            animal.makeNoise();
            animal.sleep();
            if(animal instanceof Dog || animal instanceof Cat){
                Pet p = (Pet) animal;
                p.play();

               ((Pet) animal).play();
            }
            System.out.println();
        }
    }
}
