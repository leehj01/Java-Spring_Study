package ch03;

public class FunctionTest {

    // 함수 이름과 매개 변수 ( 함수 몸체에서 사용되는 변수 )
    // 반환해줄 데이터 타입은 int 이며, 매개변수 2개이다.
    public static int addNum(int num1, int num2){
        int result ;
        result = num1 + num2 ;
        return result;  // 반환값
    }

    // 반환값이 없는 것
    public static void sayHello(String greeting){
        System.out.println(greeting);
    }

    // 반환값만 있고 매개변수는 없는 것
    public static int calcSum(){
        int sum = 0;
        int i;
        for(i = 0; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1=10;
        int n2 =20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");
        int num = calcSum();

        total = calcSum();
        System.out.println(total);
    }
}
