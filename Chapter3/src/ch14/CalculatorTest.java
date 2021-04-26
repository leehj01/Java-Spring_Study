package ch14;

public class CalculatorTest {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.desciption();

        // static 메소드이기 때문에, 인터페이스 이름을 바로 가져올 수 있다.
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));



    }
}
