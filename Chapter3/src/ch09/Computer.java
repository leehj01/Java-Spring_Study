package ch09;

public abstract class Computer {

    public abstract void display(); // 여기서는 메서드를 구체적으로 명시하지 않고, 역할을 하위 클래스로 !
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다. ");
    }
}
