package cse.oop2.ch11.custom_exception;

public class InputRangeException extends Exception{
    private int n;

    public InputRangeException(int n){  this.n = n;  }

    @Override
    public String getMessage(){
        String message = " 입력값 n에 이상이 없습니다.";
        if(n<1)
            message = String.format(" n값이 1보다 커야 합니다. (n=%d)",n);
        return message;
    }
}
