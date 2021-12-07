package cse.oop2.ch14.decorator.save_fail;

public class Score {
    private String name;
    private int num;

    public Score(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}
