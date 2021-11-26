/*
Date : 21.11.25
Title : 11장 예외 처리_p.380
Project : 인자를 받아 음 하나 발생 (midi)
 */
package cse.oop2.ch11.musicapp;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2) //args : run할때 main(String[] args)에서 받는다
            System.out.println("악기의 음높이를 지정하는 인자를 입력하세요.");
        else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer(); //플레이어 생성
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4); //CD 생성
            Track track = seq.createTrack(); //Track 생성

            MidiEvent event = null;

            ShortMessage a = new ShortMessage(); //Midi 메세지 지정
            a.setMessage(192, 1, instrument, 0); //입력된 instrument
            MidiEvent changeInstrument = new MidiEvent(a, 1);
            track.add(changeInstrument);

            ShortMessage b = new ShortMessage();
            b.setMessage(144, 1, note, 100); //입력된 note
            MidiEvent noteOn = new MidiEvent(b, 1);
            track.add(noteOn);

            ShortMessage c = new ShortMessage();
            c.setMessage(128, 1, note, 100); //입력된 note
            MidiEvent noteOff = new MidiEvent(c, 16);
            
            track.add(noteOff);
            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } //void play() 끝
}
