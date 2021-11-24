/*
Date : 21.11.24
Title : 11장 예외 처리_p.352, p.355
Project : Sequencer를 이용한 예외처리 이해
 */
package cse.oop2.ch11.trycatch;

import javax.sound.midi.MidiUnavailableException;

public class mainClass {
    /*    public static void main(String[] args) {
    MusicTest m = new MusicTest();
    m.play();
}*/
////throws 사용
    public static void main(String[] args) {
        try{
            MusicTest m = new MusicTest();
            m.play();
        } catch (MidiUnavailableException ex){ //throws의 경고장을 받는다
            System.out.println("예외 발생");
            ex.printStackTrace(); //에러의 발생 원인을 찾아서 단계별로 에러를 출력
        }
    }
}

