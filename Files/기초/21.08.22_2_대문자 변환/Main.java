// 21.08.21 / 대문자 변환
import java.util.Scanner; //Scanner 사용
public class Main{
    //STRING.toUpperCase() : 대문자 변환
    public static String upperEng(String eng){
        String ENG = eng.toUpperCase();
        return ENG;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("소문자 영어를 입력하세요 : ");
        String engSmall = input.nextLine();
        
        String engUpper = upperEng(engSmall);
        System.out.printf("대문자 변환 : %s\n", engUpper);
    }
}