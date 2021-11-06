package cse.oop2.ch06.dotcom;
import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>(); //객체 자체를 ArrayList로 만들 수도 있음
    private int numOfGuesses = 0;

    private void setUpGame(){
        //DotCom 이름 설정
        DotCom one = new DotCom();
        one.setName("First.com");
        DotCom two = new DotCom();
        two.setName("Second.com");
        DotCom three = new DotCom();
        three.setName("Third.com");
        //생성한 이름 추가
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
    }
         /* System.out.println("DotCom 게임!");
        System.out.println("3개의 DotCom을 맞추면 승리합니다.");


      for(DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3); //DotCome 갯수 설정
            dotComToSet.setLocationCells(newLocation);
        } //for문 종료*/

    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "틀림!";
        for(DotCom dotComToSet : dotComList){
            result = dotComToSet.checkYourself(userGuess);
            if(result.equals("때림!"))
                break;
            if(result.equals("물리침!")){
               // dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("모든 DotCom이 없어졌습니다! 당신의 승리!");
        if(numOfGuesses <= 18)
            System.out.println("당신은" + numOfGuesses + "만에 승리하였습니다");
        else
            System.out.println("당신은" + numOfGuesses + "번 시도하였습니다.");
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
