//실질적으로 Game이 돌아가는 코드
package cse.oop2.ch02.game2;

public class GuessGame {
    //플레이어
    Player p1;
    Player p2;
    Player p3;

    public void startGame() { //게임이 돌아가는 함수
        p1 = new Player(); //플레이어를 생성한다(객체 생성)
        p2 = new Player();
        p3 = new Player();
        
        
        int guessp1 = 0; //찍을 숫자를 저장하는 변수
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false; //정답 여부를 저장하는 변수
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random()*10); //맞춰야 할 숫자
        System.out.println("[0이상 9이하의 숫자를 맞춰보세요]");
        
        while(true){
            System.out.printf("[정답은 %d 입니다.]\n", targetNumber);
            
            p1.guess(); //Player.guess() : 정답을 난수를 이용해 자동으로 기입해준다
            p2.guess();
            p3.guess();
            
            guessp1 = p1.getNumber(); //number : Player.guess()에서 나온 난수
            //number는 private이므로 getter을 사용해야한다
            guessp2 = p2.getNumber();
            guessp3 = p3.getNumber();
            
            System.out.printf("1번 선수가 찍은 숫자 : %d\n", guessp1);
            System.out.printf("2번 선수가 찍은 숫자 : %d\n", guessp2);
            System.out.printf("3번 선수가 찍은 숫자 : %d\n", guessp3);
            
            //정답을 맞췄을 때
            if(guessp1 ==targetNumber ) { p1isRight = true; }
            if(guessp2 ==targetNumber ) { p2isRight = true; }
            if(guessp3 ==targetNumber ) { p3isRight = true; }
            
            if(p1isRight || p2isRight || p3isRight){//맞춘 선수가 있다면
                System.out.printf("\n맞춘 선수가 있습니다!\n");
                System.out.printf("1번 선수 : %b\n", p1isRight);
                System.out.printf("2번 선수 : %b\n", p2isRight);
                System.out.printf("3번 선수 : %b\n", p3isRight);
                System.out.printf("축하합니다!\n-게임이 종료되었습니다-\n\n");
                
                break; //게임이 끝나 while문을 빠져 나간다 
            } //if(p1isRight || p2isRight || p3isRight) 종료
            else{ System.out.printf("\n맞춘 선수가 없습니다\n-게임을 진행합니다.-\n\n"); }//맞춘 선수가 없다면
            
        } //while(true) 종료
    } //startGame() 종료
} //class 종료
