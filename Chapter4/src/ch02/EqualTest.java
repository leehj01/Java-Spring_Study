package ch02;

public class EqualTest {

    public static void main(String[] args) {
        Student std1 = new Student(100, "LEE");

        Student std2 = new Student(100, "LEE");

        Student std3 = std1;  // 단순히 주소값만 복사해주는 것

        System.out.println(std1 == std2);  // false
        System.out.println(std1.equals(std2));  // false - equals 의 원래 정의 : 두개의 주소값이 같냐 -> 재정의후 True
        System.out.println(std1 == std3);   // true

        System.out.println(std1.hashCode());  // 356573597
        System.out.println(std2.hashCode());  // 1735600054

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());   // 96354
        System.out.println(str2.hashCode());   // 96354
    }
}
