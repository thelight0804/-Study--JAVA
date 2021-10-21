package cse.oop2.ch05.simpledotcom;
public class SimpleDotCom {
    int[] monster; //맞춰야 할 상대(배열)
    int hits = 0; //맞춘 횟수 / monster의 길이와 연관
    
    public void setMonster(int[] num) {  monster = num;  } //monster 수 설정
    
    public String check(String input){ //입력한 값을 체크
        //입력(input)받은 값을 추측(guess)에 저장
        int guess = Integer.parseInt(input); //Integer.parseInt(STR) : String을 Int로 변환
        String result = "땡!";
        for(int i=0; i<monster.length;i++){ //monster의 처음부터 끝까지 체크
            if(guess == monster[i]){ //guess와 monster[i]가 일치하면
                result = "때림!";
                hits++;
                break; //바로 for문을 빠져 나간다
            }
        } // for(int i=0; i<monster.length;i++) 종료
        
        if(hits == monster.length) //모두 맞추면
            result = "물리침!";
        System.out.println(result);
    }
}
