package ch19;

public class ForTest {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++, count++) { // 10 번을 반복한다는 의미
            // for ( int i = 0 , count = 1 ; i < 10 , i++ , count++ )
            sum += count;
            //count++
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while (num <= 10) {
            total += num;
            num++;

        }
        System.out.println(total);
    }
}
