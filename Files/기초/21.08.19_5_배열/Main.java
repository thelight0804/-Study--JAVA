//21.08.19 / 배열
public class Main{
    public static void main(String[] args){
    //데이터타입[] 배열명 = new 데이터타입[크기]
    int[] array_a = new int [10];
    double array_b[] = new double [10];
    /*[]의 위치는 배열명 앞이나 뒤나 상관없다
      배열은 0으로 초깃값이 설정된다
    */
    
    for (int i=0; i<10; i++){
        System.out.print(array_a[i]);
        }
    System.out.println();
    for (int i=0; i<10; i++){
        System.out.print(array_b[i]);
        }
    System.out.println();
    //ARRAY.length : 배열 갯수
    System.out.println(array_a.length);
    }
}