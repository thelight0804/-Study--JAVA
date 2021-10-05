package cse.oop2.ch03.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamTestDrive {

    public static List<Person> persons = new LinkedList<>();

    public static void main(String[] args) {
        initialize();
        
        //남자 수
        long maleCount = persons.stream()
                .filter(e->e.getGender() == Gender.MALE).count();
        System.out.printf(">>> 남자는 %d명 입니다.%n"), maleCount);
        
        //여자 나이
        OptionalDouble gemailAverageAge = persons.stream()
                .filter(e->e.getGender() == Gender.FEMALE)
                .mapToInt(Person::getAge)
                .average();
        if(femaileAverageAge.isPresent()){
            System.out.printf(">>> 여자의 평균 나이는 &.2f입니다.%n", femaleAverageAge.getAsDouble());
        }
        
        System.out.println(">>> 20~25살인 여자의 이름을 정렬해서 출력");
        Stream<Person> sp = persons.stream()
                .filter(e->e.getGender()==Gender.FEMALE)
                .filter(e->e.getGender() >= 20&&e.getAge() <= 25)
                .sorted();
        sp.forEach(e->System.out.printf("%s%n", e.getName()));
    }
}


public static void initialize(){
    Person[] data = {
        new Person("Linda", 21, Gender.FEMAIL),
        new Person("Oliver", 25, Gender.MAIL),
        new Person("Alice", 27, Gender.FEMAIL),
        new Person("Noah", 19, Gender.MAIL),
        new Person("Abby", 23, Gender.FEMAIL),
        new Person("Dasisy", 25, Gender.FEMAIL),
        new Person("Samuel", 31, Gender.MAIL),
        new Person("Crystal", 31, Gender.FEMAIL),
        new Person("Tadeo", 33, Gender.MAIL),
    };
    for(Person p : data){
        persons.add(p);
    }
}