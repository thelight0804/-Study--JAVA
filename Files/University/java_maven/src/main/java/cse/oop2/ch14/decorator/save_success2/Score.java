package cse.oop2.ch14.decorator.save_success2;

public class Score implements java.io.Serializable {

    private Person person;
    private int num;

    public Score(Person person, int num) {
        this.person = person;
        this.num = num;
    }

    public Person getPerson() {
        return person;
    }

    public int getNum() {
        return num;
    }
}
