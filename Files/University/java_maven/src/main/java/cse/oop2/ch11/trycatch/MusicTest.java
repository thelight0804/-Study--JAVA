package cse.oop2.ch11.trycatch;

import javax.sound.midi.*;


public class MusicTest {
    /*    public void play(){ //예외 오류 발생
            Sequencer Sequencer = MidiSystem.getSequencer(); //예외처리를 해주어야 한다
            System.out.println("Sequencer 객체 생성 완료");
        }*/
/*        public void play(){ //try/catch 예외 처리
            try{ //Sequencer의 불안정한 메소드 사용
                Sequencer Sequencer = MidiSystem.getSequencer();
                System.out.println("Sequencer 객체 생성 완료");
            } catch(MidiUnavailableException ex){ //예외 발생 시
                System.out.println("예외 발생");
            } finally{ //예외 상관 없이 항상 실행
                System.out.println("finally는 항상 작동합니다");
            }
    }*/
        public void play() throws MidiUnavailableException{ //throws : 예외를 미리 알림
            Sequencer Sequencer = MidiSystem.getSequencer();
            System.out.println("Sequencer 객체 생성 완료");
    }
}