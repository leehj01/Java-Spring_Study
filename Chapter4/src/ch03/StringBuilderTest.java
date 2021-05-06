package ch03;

public class StringBuilderTest {

    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("android");

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer)); // 356573597  - 속도가 빠름
        buffer.append(str2); // 복잡한 애들도 append로 넣을 수 있다.
        System.out.println(buffer); // javaandroid
        System.out.println(buffer.getClass().getName());  // 타입 확인 : java.lang.StringBuilder
        System.out.println(System.identityHashCode(buffer)); // 356573597

        String test = buffer.toString(); // 결론적으로는 스트링으로 받아야함 . 사용할때는 toString 으로 변환해주면 된다.
        System.out.println(test);
        System.out.println(test.getClass().getName()); // 타입 확인 : java.lang.String
    }
}
