package cse.oop2.ch10.wrapper;
/*
Date : 21.11.18
Title : 10장 정적 변수, 정적 메소드_p.321
Project : Boxing, Unboxing
 */
import java.util.LinkedList;
import java.util.List; //List<Integer>
import java.util.Optional;
import java.util.OptionalDouble;

public class WrapperClassTest {
    public static void doSomething(List<Integer> numbers){
        System.out.print("첫 번째 출력 : ");
        numbers.forEach(e->System.out.print(e.toString()+" ")); //람다식 forEach

        System.out.print("\n두 번째 출력 : ");
        for(int e : numbers){ System.out.print(e+" "); }

        System.out.print("\n합계 1 : ");
        Optional<Integer> sum1 = numbers.stream().reduce((x, y)->x+y);
        if(sum1.isPresent()){  System.out.println(sum1.get());  }

        System.out.print("합계 2 : ");
        //Integer::sum 이용
        Integer sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);
        
        //mapToInt : 모두 숫자로 받는다
        System.out.print("합계 3 : ");
        Integer sum3 = numbers.stream().mapToInt(e->e).sum();
        System.out.println(sum3);

        System.out.print("평균 : ");
        OptionalDouble avg = numbers.stream().mapToInt(e->e).average();
        if(avg.isPresent()){  System.out.println(avg.getAsDouble());}
    } //doSomething 끝

    public static void doConversion(){
        Integer i1 = Integer.parseInt("123");
        //= Integeri1 = new Integer("123") - 권장 X
        String s1 = i1.toString();

       // System.out.printf("%d %s %d%n", i1, s1, numbers);
        System.out.printf("%d %s %n", i1, s1);

        try{  Integer i3 = Integer.parseInt(("123.5")); } //"hello"
        catch(NumberFormatException ex) {System.err.println("예외 발생 : " + ex); }
    } //doConversion() 끝


    public static void main(String[] args){
        List<Integer> numbers = new LinkedList<>(); //Integer 형식의 LinkedList
        for(int i=0; i<20;i++){
            //auto boxing의 boxing
            int value = (int)(Math.random() * 100); //10~100
            numbers.add(value);
        }
        doSomething(numbers);
        doConversion();
    } //main 끝
} //class 끝
