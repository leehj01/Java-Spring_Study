package ch14;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentLEE = new Student("lee", 5000);
        Student studentTOM = new Student("tom", 10000);

        Bus bus100 = new Bus(100);

        Subway subwayGreen = new Subway(2);

        studentLEE.takeBus(bus100);
        studentTOM.takeSubway(subwayGreen);

        studentLEE.showInfo();
        studentTOM.showInfo();

        bus100.showBusinfo();

        subwayGreen.showSubwayInfo();


    }
}
