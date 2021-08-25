//21.08.17 - 메인메서드, static
public class main{
    public static void main(String[] args){
        //메인[main]메서드는 무조건 "main"으로 해야한다 (main_method, main2... (X))
        System.out.println("Hello world!");
    }
}
/*
static
    JAVA 가상머신에서 인스턴스 객체의 생성 없이 호출을 할 수 있게 한다.
    객체[인스턴스] 생성없이 함수를 호출해서 사용한다
    JAVA는 static으로 지정된 메서드를 먼저 찾아서 메모리에 할당시킨다
    static이 여러개인 경우 모두 메모리에 할당시킨다
    이후 main 함수를 실행한다

객체[인스턴스]
    공장, 틀에서 나온 로봇

메인메서드( main() )
    JAVA가 실행될때 가장 먼저 실행되는 부분 (시작 부분) [entry point]
    = C++) void main(){ }

매개변수[파라미터스] (String[] args)
    String - 문자열 / [] - 배열
*/