//21.08.24 / 2개 이상의 return
import java.util.Arrays; //Arrays.toString 사용

public class Study{
    public static int[] functionA(){ //int [] : 배열 타입
        int num1 = 100, num2 = 200;
        //return num1, num2; //python은 가능
        return new int [] {num1, num2};
    }
    
    public static void main(String[] args){
        //배열 사용!
        int result [] = functionA();
    
        System.out.println(Arrays.toString(result));
    }
}