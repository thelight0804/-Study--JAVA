//21.08.19 / 삼항연산자
public class Main{
    public static void main(String[] args){
        int a = 10;
        int b = 100;
        a = a<=10 ? a*5 : a; // = if(a <= 10) a*5;  else  a
        b = b<=10 ? b*5 : b;
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}