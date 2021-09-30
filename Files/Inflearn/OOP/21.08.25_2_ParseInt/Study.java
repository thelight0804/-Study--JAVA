//21.08.25 / parseInt
public class Study{
    public static void main(String[] args){
        String a = "10";
        String b = "20";
        String c = a+b;
        //getClass() : class와 data 타입 확인
        System.out.println("c = " + c);
        System.out.println(c.getClass());
        
        //Integer.parseInt(STRING) : STRING -> int / Integer 클래스의 parseInt 메서드
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        System.out.println("Integer.parseInt -> a1+b1 = " + a1+b1);
        
        //Integer.parseInt("NUM", 진수) : NUM의 진수를 10진수로 표현
        System.out.println("-------------------");
        System.out.println("1011(2) = " + Integer.parseInt("1011", 2)); //1011의 2진수 = 11
        System.out.println("1004(8) = " + Integer.parseInt("1004", 8)); //1004의 8진수 = 516
        System.out.println("A(16) = " + Integer.parseInt("A", 16)); //A의 16진수 = 10
        System.out.println("F(16) = " + Integer.parseInt("F", 16)); //F의 16진수 = 15
        System.out.println("FF(16) = " + Integer.parseInt("FF", 16)); //FF의 16진수 = 255(15*16^0 + 15*16^1)
        //16진수 = 0,1,2,3,4,5,6,7,8,9,A(10),B(11),C(12),D(13),E(14),F(15)
    }
}