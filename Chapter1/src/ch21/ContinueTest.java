package ch21;

public class ContinueTest {
    public static void main(String[] args) {
        int num ;
        for (num = 1; num <= 100 ; num++){
            if ( ( num % 3) != 0) continue;
// continue 를 사용하면 아래를 무시하고, 위로 올라가라는 의미이다.
            System.out.println(num);
        }
    }
}
