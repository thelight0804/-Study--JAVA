// 21.08.20 / 배열 함수
import java.util.Arrays; //Arrays.toString()에 필요

public class Main{
    public static void main(String[] args){
        int array_a[] = {1, 2, 3, 4, 5};
        double array_b[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        char array_c[] = {'가', '나', '다', '라', '마'};
        
        //마지막 배열 요소 값 출력
        System.out.println("array_a[4] = " + array_a[array_a.length-1]);
        System.out.println("array_b[4] = " + array_b[array_b.length-1]);
        System.out.println("array_c[4] = " + array_c[array_c.length-1]);
        System.out.println();
        
        //배열 주소 값 출력
        System.out.println(array_a); //int형 : [I ~
        System.out.println(array_b); //double형 : [D ~
        System.out.println(array_c); //char형 : 값 출력 -_-
        System.out.println();
        
        //Arrays.toString(ARRAY) : []형태로 배열 요소 출력 (String)
        System.out.println(Arrays.toString(array_a));
        System.out.println(Arrays.toString(array_b));
        System.out.println(Arrays.toString(array_c));
        System.out.println();
        
        //System.arraycopy() : 배열 요소 복사
        int [] array_x = {10,20,30,40,50};
        int [] array_y = {1,2,3,4,5,6,7,8,9,10};
        
        System.arraycopy(array_x, 1, array_y, 0, 3);
        /*System.arraycopy(배열1, 인덱스1, 배열2, 인덱스2, 길이)
        배열1의 인덱스1의 값에서 길이만큼 배열2의 인덱스2부터 복사한다*/
       
       //향상된 for문으로 배열 요소 출력
       for(int i: array_y) //i를 선언하여 array_y의 요소를 넣는다
           System.out.print(i+" ");
        System.out.println();
        
        //charAt( ) : STRING의 한 글자만 반환
        String [] array_s = {"DJMAX", "Rhythm Doctor", "ADFI"};
        System.out.println(array_s[2].charAt(1)); 
        //ARRAY.charAt(NUM) : 해당 ARRAY의 NUM번째 글자를 반환
    }
}