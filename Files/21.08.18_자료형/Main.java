//21.08.18 - 변수 자료형
package pkg21.pkg08.pkg18_자료형;
public class Main {
    public static void main(String[] args) {
        //SIZE : bit 계산 (bit = byte * 8), BYTES : byte 계산 / 첫문자 대문자 사용
        System.out.println("byte : " + Byte.SIZE + "bit  " + Byte.BYTES + "byte  " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.SIZE + "bit  " + Short.BYTES + "byte  " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int : " + Integer.SIZE + "bit  " + Integer.BYTES + "byte  " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);  //Integer = int
        System.out.println("long : " + Long.SIZE + "bit  " + Long.BYTES + "byte  " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("-----------------------");
        System.out.println("float : " + Float.SIZE + "bit  " + Float.BYTES + "byte  " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double : " + Double.SIZE + "bit  " + Double.BYTES + "byte  " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        System.out.println("-----------------------");
        System.out.println("Character : " + Character.SIZE + "bit  " + Character.BYTES + "byte  " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE); //Character = char
         //단순히 Character.MAX_VALUE라고 쓰면 해당 수의 문자가 출력된다 / Char은 음수가 없다
        
        /* 기본형 타입(Primitive Data Type)
                정수형 : byte(1byte), short(2), *int(4), long(8)
                실수형 : float(4), *double(8)
                문자형 : char(2) / 문자열 타입은 없다
                bool형 : beelean (1) */
        /* 참조형 타입(Reference Data Type) : 데이터가 저장되는 메모리의 주소값(위치)을 저장하는 변수
                클래스(class), 배열(array), 인터페이스(interface), 문자열(string)... */
    }
}
