package cse.oop2.ch03.stream;

//enum : 열거형 / 여러 상황을 자동으로 값을 매겨준다.

public enum Gender{
    FEMALE("female"),
    MALE("male");
    
    private String info;
    private Gender(String info){this.info = info;}
    public String toString(){return info;}
}