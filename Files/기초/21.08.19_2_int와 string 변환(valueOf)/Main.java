public class Main{
    public static void main(String[] args){
        //length() : STRING 길이
        String b = "54321"; //string 선언할때 S(대문자)로 해야한다
        System.out.println(b.length());
        
        //String.valueOf(VALUE) : 숫자(정수, 실수)를 STRING으로 변환
        int a = 321;
        String c = String.valueOf(a); //c = "321"
        System.out.printf("c = %S, c.length = %s \n", c, c.length());
        
        //Integer.valueOf(VALUE) : STRING을 정수로 변환
        String x = "654321";
        int z = Integer.valueOf(x); //z = 654321
        System.out.printf("z = %d, z+1 = %d", z, z+1);
    }
}