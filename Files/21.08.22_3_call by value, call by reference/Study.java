//21.08.22 / call by value, call by reference
public class Study{
        public static void sum(int a){ //call by value
        a += 400;
        System.out.printf("sum() a = %d\n", a);
        }
        
        public static void sum2(Integer b){ //call by reference
        b += 400;
        System.out.printf("sum2() b = %d\n", b);
        }
        
    public static void main (String[] args){
        int a = 100;
        sum(a); //call by value
        System.out.printf("main() a = %d\n", a);
        
        //call by reference
        //int [] a = new int [] : a=주소값
        Integer b = new Integer(100); //b= 주소값
        sum2(b); //객체 자체(주소값)을 넘긴다
        System.out.printf("main() b = %d\n", b);
    }
}