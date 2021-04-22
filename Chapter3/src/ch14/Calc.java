package ch14;

public interface Calc {

    double PI = 314;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void desciption(){
        System.out.println("정수의 사칙 연산을 제공합니다.");
//        myMethod();
    }

    static  int total(int[] arr){

        int total = 0;
        for(int num : arr){
            total += num;
        }
//        myStaticMethod();
        return total;
    }

    // 아래와 같은 private 메서드는 자바 9 버전 이후로 만 가능하다.
//    private void myMethod(){
//        System.out.println("myMethod");
//    }
//
//    private static void myStaticMethod(){
//        System.out.println("myStaticMethod");
//    }

}
