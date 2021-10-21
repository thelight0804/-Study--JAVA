package cse.oop2.ch04.encapsulation;
public class Korean {
    int money;
    String name;

    public Korean(int money, String name) {
        this.money = money;
        this.name = name;
    }
    

    public int getMoney() {  return money; }  //Alt+Insert로 쉽게 생성 가능
    public void setMoney(int money) {  this.money = money;  }
    
    public String getName() { return name;  }
    public void setName(String name) {  this.name = name; }
    
    void rank(){ //계급을 나타내는 함수
        if(money > 10000)
            System.out.println(name+"의 계급은 「금수저」입니다.");
        else if (money >1000)
            System.out.println(name+"의 계급은 「은수저」입니다.");
        else
            System.out.println(name+"의 계급은 「흙수저」입니다.");
    }
}
