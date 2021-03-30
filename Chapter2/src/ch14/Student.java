package ch14;

public class Student {
    String Studentname ;
    int money;

    // 학생을 생성
    public Student(String Studentname, int money){
        this.Studentname = Studentname;
        this.money = money;
    }

    //버스를 타기
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;

    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(Studentname + " 남은 돈은 " + money +"원 입니다.");
    }

}


