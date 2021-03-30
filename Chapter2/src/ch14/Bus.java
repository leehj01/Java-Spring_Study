package ch14;

public class Bus {
    int busNum;
    int personCnt;
    int money;

    public Bus( int busNum ){
        this.busNum = busNum;
    }

    // int money 는 학생이 지불한 돈
    public void take ( int money ){ // 승차
        this.money += money;
        personCnt++;
    }

    public void showBusinfo(){
        System.out.println(busNum + "번의 승객수는 "+ personCnt + "명이고, 남은 돈은 " + money +"원 입니다. ");
    }
}
