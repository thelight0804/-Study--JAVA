package cse.oop2.ch03.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamTestDrive {

    public static List<Person> persons = new LinkedList<>();
    
    public static void initialize(){
    Person[] data = {
        new Person("Linda", 21, Gender.FEMALE),
        new Person("Oliver", 25, Gender.MALE),
        new Person("Alice", 27, Gender.FEMALE),
        new Person("Noah", 19, Gender.MALE),
        new Person("Abby", 23, Gender.FEMALE),
        new Person("Dasisy", 25, Gender.FEMALE),
        new Person("Samuel", 31, Gender.MALE),
        new Person("Crystal", 31, Gender.FEMALE),
        new Person("Tadeo", 33, Gender.MALE),
    };
    for(Person p : data){
        persons.add(p);
    }
}

    public static void main(String[] args) {
        initialize();
        
        //남자 수
        long maleCount = persons.stream()
                .filter(e->e.getGender() == Gender.MALE).count(); //.filter : 뽑아낸다
        System.out.printf(">>> 남자는 %d명 입니다.%n", maleCount);
        
        //여자 나이
        OptionalDouble femaleAverageAge = persons.stream()
                .filter(e->e.getGender() == Gender.FEMALE)
                .mapToInt(Person::getAge)
                .average(); //정렬
        if(femaleAverageAge.isPresent()){
            System.out.printf(">>> 여자의 평균 나이는 &.2f입니다.%n", femaleAverageAge.getAsDouble());
        }
        
        System.out.println(">>> 20~25살인 여자의 이름을 정렬해서 출력");
        Stream<Person> sp = persons.stream()
                .filter(e->e.getGender()==Gender.FEMALE)
                .filter(e->e.getAge() >= 20&&e.getAge() <= 25)
                .sorted();
        sp.forEach(e->System.out.printf("%s%n", e.getName()));
    }
}