//21.08.19 / print, println, printf
public class Printf{
    public static void main(String[] args){
        //print : \n이 되지 않는다
        System.out.print("도레미파"); 
        System.out.print("솔라시도");
        System.out.println(" ");
        System.out.println("-------------------");
        //println : 끝에 \n을 추가한다 (print Line)
        System.out.println("도레미파");
        System.out.println("솔라시도"); 
        System.out.println("-------------------");
        //printf : 지지자를 사용 )%d, %f etc...
        int age = 23;
        System.out.printf("저는 %d살입니다", age);
    }
}