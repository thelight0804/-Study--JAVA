package cse.oop2.ch06.dotcom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "ABCDEFG";
    private final int gridLength = 7; //final : 상수 (변하지 않는 값)
    private int gridSize = 49;
    private final int[] grid = new int[gridLength];
    private int comCount = 0;

    public String getUserInput(String user){
        String inputLine = null;
        System.out.print(user + " ");
        try{ //예외
            BufferedReader is =new BufferedReader
                    (new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() ==0)
                return null;
        } //try 끝
        catch(IOException e){
            System.out.println("IOException: "+ e); }

        return inputLine.toLowerCase(); //toLowerCase() 소문자 변경
    }
    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String temp = null;
        int[] coords = new int[comSize]; //coords{0,1,2}
        int attempts = 0;
        boolean success = false; //DotCom 배치 여부
        int location = 0; //시작 장소

        //DotCom 배치
        comCount++;
        int incr = 1;
        if((comCount%2) ==1) //DotCom을 가로-세로-가로로 배치
            incr = gridLength;

        while(!success & attempts ++ <200){
            location = (int) (Math.random()*gridSize); //0~48 반환
            int x = 0;
            success = true;
            while(success && x<comSize){
                if(grid[location] == 0){
                    coords[x++] = location; //랜덤으로 배치된 위치를 저장한다
                    location +=incr; //처음 나온 수에 7씩 더한다 (4-11-18)
                    if(location >= gridSize)
                        success = false;
                }
            }
        } //while(!success & attempts ++ <200) 종료
        int x = 0;
        int row = 0;
        int column = 0;
        while(x<comSize){
            grid[coords[x]] = 1; //저장된 DotCom 위치를 1로 지정 / coords[x] = DotCom이 위치한 곳
            row = (int) (coords[x] / gridLength); //몫
            column = coords[x] % gridLength; //나머지
            temp = String.valueOf(alphabet.charAt(column)); //"ABCDEFG"중 column번째 알파벳 반환

            alphaCells.add(temp.concat(Integer.toString(row))); //concat() : STR뒤에 추가한다
            x++;
        }
        return alphaCells;
    }
}
