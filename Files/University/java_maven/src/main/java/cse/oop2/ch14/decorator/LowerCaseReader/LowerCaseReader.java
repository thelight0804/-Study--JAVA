package cse.oop2.ch14.decorator.LowerCaseReader;

import java.io.*;

//LowerCaseReader : 입력 스트림을 줄 단위로 읽어 대문자를 소문자로 변환한다 (한글 지원 O)
public class LowerCaseReader extends FilterReader {
    public LowerCaseReader (Reader in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }
}
