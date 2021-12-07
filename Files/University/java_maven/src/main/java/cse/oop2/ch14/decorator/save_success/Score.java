package cse.oop2.ch14.decorator.save_success;

public class Score implements java.io.Serializable{
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
