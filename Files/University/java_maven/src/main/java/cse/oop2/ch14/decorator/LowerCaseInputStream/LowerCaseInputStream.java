package cse.oop2.ch14.decorator.LowerCaseInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

//LowerCaseInputStream : 입력 스트림을 바이트 단위로 읽어 대문자를 소문자로 변환한다 (한글 지원 X)
//LowerCaseInputStream은 FilterInputStream를 상속받는다 (하위 클래스)
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream (InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c)); //-1 = EOF (End Of File)
/* (c==-1 ? c : Character.toLowerCase((char) c)
 =      if(c==-1)
            return c;
        else
            return Character.toLowerCase((char) c);*/
    }
}
