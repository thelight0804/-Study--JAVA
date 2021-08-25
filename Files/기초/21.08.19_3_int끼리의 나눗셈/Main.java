//21.08.19 / int끼리의 나눗셈
public class Main {
    public static void main(String[] args) {
        int a = 20, b = 8;
        double result = a / b; //int끼리의 계산은 int형이다
        System.out.println("a / b = " + result);
        
        result = a / (double)b;
        System.out.println("a / (double)b = " + result);
    }
}
