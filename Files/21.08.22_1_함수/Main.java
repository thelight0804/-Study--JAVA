//21.08.22 / 함수
package pkg21.pkg08.pkg22_1_함수;
public class Main{
    //함수 생성
    public static void helloWorld(){ //main이 static이므로 함수도 static형식으로 만들어야 한다
        System.out.println("Hello Guys :D");
    }
    public static int plus(int a, int b){ //매개변수 함수
        return a+b;
    }
    public void call(){ //객체를 이용한 함수 (static 없음)
        System.out.println("Rollin");
    }
    
    public static void main(String[] args){
        //main함수는 static 함수만 호출이 가능하다
        //함수 호출
        helloWorld();
        
        //매개변수 함수
        int a=5, b=10;
        int result = plus(a, b);
        System.out.printf("%d + %d = %d\n", a, b, result);
        
        //객체 생성 후 함수
        Main obj =  new Main(); //obj 객체 생성
        obj.call();
    }
}