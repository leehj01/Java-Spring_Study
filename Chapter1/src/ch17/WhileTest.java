package ch17;

public class WhileTest {
    public static void main(String[] args) {

        int num = 1 ;
        int sum = 0; //  초기화 해주는 것이 중요하다.

        while ( num <= 10 ){

            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
