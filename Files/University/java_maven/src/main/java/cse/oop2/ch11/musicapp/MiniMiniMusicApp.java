/*
Date : 21.11.24
Title : 11장 예외 처리_p.376
Project : 음 하나 발생 (midi)
 */
package cse.oop2.ch11.musicapp;
import javax.sound.midi.*; //midi 패키시 import

public class MiniMiniMusicApp {
    public void play(){
        try{ //예외 처리
            Sequencer player = MidiSystem.getSequencer(); //player 플레이어 생성
            player.open(); //Sequencer를 열지 않으면 쓸 수 없다
            
            Sequence seq = new Sequence(Sequence.PPQ, 4); //seq CD 생성
            Track track = seq.createTrack(); //track 트랙 생성

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100); //메시지 유형, 채널, 음높이, 속도
            /*
            144 = NOTE_ON
            128 = NOTE_OFF
             */
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(144, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq); //CD를 플레이어에 삽입
            player.start();
        } catch (Exception ex){
            ex.printStackTrace();
        } //catch 끝
    } //play() 끝

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
} //class MiniMiniMusicApp 끝
