package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){} // 추상 메서드가 아니라 구현 메서드 - 다만 구현 메서드의 내용이 없는 것 뿐 -> 추상 메서드가 아님 -> 오류 안남
    // 필요한 경우에 재정의

    final public void run(){ // 여기서 final 을 사용한 이유는, 차가 시동걸고 뭄직이고 하는 과정의 순서가 바뀌면 안되기 때문.
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
