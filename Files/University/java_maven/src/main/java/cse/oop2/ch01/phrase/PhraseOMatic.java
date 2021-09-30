//21.09.16 / 문자열 배열
package cse.oop2.ch01.phrase;
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] JPwordList = {"花", "狙う", "姓名", "治める", "筆者", "しいんと", "茹でる", "蹴る", "単純", "町", "複雑だ"}; //일본어 단어
        String[] ENwordList = {"inoculation", "within", "recommend", "mandatory", "decision", "various", "Parents", "percent", "to allow", "government", "vaccinations"}; //영어 단어
        String[] AsiaWordList = {"네팔", "동티모르", "방글라데시", "사우디아라비아", "스리랑카", "이라크", "우즈베키스탄", "러시아", "투르크메니스탄", "파키스탄", "이스라엘"}; //아시아 국가
        
        int JPLength = JPwordList.length; //ARRAY.length : ARRAY 개수
        int ENLength = ENwordList.length;
        int AsiaLength = AsiaWordList.length;
        
        int JPrand = (int) (Math.random() * JPLength); //Math.random : 랜덤 함수
        int ENrand = (int) (Math.random() * ENLength);
        int Asiarand = (int) (Math.random() * AsiaLength);
        
        //String 구문 만들기
        String phrase = JPwordList[JPrand] + ", " + ENwordList[ENrand] + ", " + AsiaWordList[Asiarand];
        
        System.out.println("당신이 오늘 외워야 할 단어는 '" + phrase + "'입니다.");
    }
}
