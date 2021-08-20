//21.08.20 / 2차원 배열
public class Main {
    public static void main(String[] args) {
           int [] [] array = {{1,2,3}, {10,20,30, 40}};
           for(int i=0; i<array.length; i++){
               for(int j=0; j<array[i].length; j++){
                   System.out.print(array[i][j] + " ");
               }
               System.out.println();
           }
           //2차원 배열의 개수
           System.out.println(array.length); //array 전체의 배열 수
           System.out.println(array[1].length); //array[1]의 배열 수
    }
}
