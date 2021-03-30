package ch14;

public class Subway {

    int lineNum;
    int personCnt;
    int money;

    public Subway(int lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int money){
        this.money += money;
        personCnt++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNum + "번 지하철 승객은 " + personCnt + "명 이고, 수입은 " + money + "원 입니다.");

    }
}
