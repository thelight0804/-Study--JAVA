//21.08.24 / 소,대문자 변환
import java.util.Scanner;
import java.util.Arrays;

public class Study{
    public static String[] changeEng(String a, String b){ //소,대문자 변환 함수
        String aBig = a.toUpperCase();
        String bSmall = b.toLowerCase(); //소문자 전환
        
        //두 개 이상의 값 return = 배열 사용
        return new String[] {aBig, bSmall};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String [] names = new String [2];
        System.out.print("소문자 영어를 입력해 주세요 : ");
        names[0] = input.nextLine();
        System.out.print("대문자 영어를 입력해 주세요 : ");
        names[1] = input.nextLine();
        
        //변수를 이용한 함수
        String result[] = changeEng(names[0], names[1]);
        
        System.out.println(Arrays.toString(result));
    }
}