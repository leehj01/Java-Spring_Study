package ch14;

// 추상메서드를 다 포함하는게 아니기 때문에, 추상 클래스가 된다.
public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
