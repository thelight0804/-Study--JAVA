//21.08.20 / 사용자 입력
import java.util.Scanner; // Scanner 사용에 필요
public class Main{
   public static void main(String[] args){
       // 1 : 입력을 위한 객체 선언
       Scanner sc = new Scanner(System.in);
       
       // 2 : 입력 받아 저장
       System.out.print("나이를 입력하세요 : ");
       int age = sc.nextInt(); //next + DATATYPE
       
       System.out.printf("당신의 나이는 %d입니다", age);
   } 
}