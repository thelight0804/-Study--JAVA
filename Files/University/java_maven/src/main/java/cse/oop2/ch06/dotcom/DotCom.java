//DotCom 관련 클래스
package cse.oop2.ch06.dotcom;
import java.util.ArrayList; //ArrayList 사용
public class DotCom {
    private ArrayList<String>  locationCells;
    private String name; //DotCom 이름

    public void setLocationCells(ArrayList<String> str){ //DotCom 위치 지정
        locationCells = str;
    }
    public String checkYourself(String userInput){ //DotCom의 정답 여부 확인
        String result = "miss"; //miss로 초기화
        int index = locationCells.indexOf(userInput); //userInput가 있는 index 번호 반환
        if(index>=0){ //정답인 경우
            locationCells.remove(index); //index의 데이터 지움
            if(locationCells.isEmpty()) //locationCells가 비었다면
                result = "물리침!";
            else
                result = "때림!";
        }
        return result;
    } //String checkYourself () 종료
    public void setName(String name) {
        this.name = name;
    }
}
