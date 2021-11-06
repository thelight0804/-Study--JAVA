package cse.oop2.ch07.overridingTest;

public class Job extends Human {
    String job;
    public Job(){};
    public Job(String name, int age, String job){
        super(name, age); //Human의 name과 age 설정
        this.job = job;
    }
    public void info(){
        System.out.printf("직업 : %s%n", job);
    }
    public void infoPlus(){ //오버라이딩+상위클래스 호출
        super.info(); //super(상위클래스)의 info 함수 호출
        System.out.printf("직업 : %s", job);
    }
}
