package cse.oop2.ch11.custom_exception;

public class MySum {
    private int n = 0;

    public int getN() {   return n;  }
    public void setN(int n) {  this.n = n;  }

    public int getSum() throws InputRangeException{ //1~n까지의 덧셈
        if(n<1){ //n이 1보다 작으면
            throw new InputRangeException(n); //예외를 던진다(throw)
        }
        return (n*(n+1)/2);
    }
}
