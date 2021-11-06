package cse.oop2.ch07.privateValue;
public class Base {
    private int number;

    public Base(){
        this(1);
    }

    public Base(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
