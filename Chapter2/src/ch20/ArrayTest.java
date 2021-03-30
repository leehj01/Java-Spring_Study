package ch20;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int arr2[] = new int[10];

        int[] numbers = {10,20,30};

        for (int i  :  numbers){
            System.out.println(i); //10 20 30
        }

        int[] ids;
        ids = new int[]{10,20,30};

        // 처음부터 끝까지 쭉 순회할때 쓰는 for 문 코드
        for (int i : ids){
            System.out.println(i); //10 20 30
        }

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0 , num = 1 ; i < arr.length ; i++ , num++){
            arr[i] = num;
        }

        System.out.println(arr);

        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }

        System.out.println(total);  // 55

        // 배열의 길이와 요소의 개수가 동일하지않을 때, 오류가 나타날 수 있음 - 그럴때 아래와 같이 코드 작성
        // 1) 오류 코드
//        double[] dArr = new double[5];
//
//        dArr[0] = 1.1;
//        dArr[1] = 2.1;
//        dArr[2] = 3.1;
//
//        double mtotal = 1;
//        for  (int i = 0; i <  dArr.length; i++){
//            mtotal *= dArr[i];
//        }
//        System.out.println(mtotal);

        // 2) 수정 코드
        double[] dArr = new double[5];
        int count = 0; // 요소변수에 따라 카운트 변수를 따로 줌
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1;  count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for (int i = 0; i<count; i++){
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);

    }
}
