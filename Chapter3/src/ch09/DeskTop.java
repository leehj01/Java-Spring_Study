package ch09;

public class DeskTop extends Computer{

    // 추상 클래스를 상속 받으면, (여기선) 두개의 추상 메서드를 받게 된다.
    // 여기서도, 그 추상 메서드에 대해서 구체화하지 않으면 abstract 를 넣어서 추상 클래스로 만든다.
    @Override
    public void display(){
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    // 이미 상위 클래스에서 구현한 것을 재정의 해두됨

    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }
}
