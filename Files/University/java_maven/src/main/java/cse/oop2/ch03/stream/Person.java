package cse.oop2.ch03.stream;

public class Person implements Comparable <Person>{
    private String name;
    private int age;
    private Gender gender; //Gender.java의 gender

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public Gender getGender() { return gender; }
    
    @Override
    public int compareTo(Person o){
        return name.compareTo(o.name);
        //(name<o)  = -1, (name == o) = 0, (name>0) = 1
    }
}

