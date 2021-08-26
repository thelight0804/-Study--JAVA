//21.08.26 / 최대,최솟값 구하기
import java.util.Arrays;
public class Study{
    public static int arrayMax(int [] num){ //최댓값 함수
        int max = num[0]; //가장 큰 값을 배열 첫번째 값으로 초기화
        for(int i=0;i<num.length;i++){
             //Math.max(NUM, NUM1) : NUM과 NUM1중 큰 값 반환
            max = Math.max(max, num[i]);
        }
        return max;
    }
        public static int arrayMin(int [] num){ //최솟값 함수
        int min = num[0];
        for(int i=0;i<num.length;i++){
            min = Math.min(min, num[i]);
        }
        return min;
    }
    /////////////////////////////////////////////
    public static void main(String[] args){
        int [] num = {1000,1,5,-10,30,54,30,-500, 523};
        System.out.println("num[] = " + Arrays.toString(num));
        int max = arrayMax(num); //최대값
        int min = arrayMin(num); //최솟값
        
        
        System.out.println("최댓값 = " + max);
        System.out.println("최솟값 = " + min);
    }
}