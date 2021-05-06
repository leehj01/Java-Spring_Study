package ch02;

public class EqualTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        Student std1 = new Student(100, "LEE");

        Student std2 = new Student(100, "kim");

        Student std3 = std1;  // 단순히 주소값만 복사해주는 것

        System.out.println(std1 == std2);  // false
        System.out.println(std1.equals(std2));  // false - equals 의 원래 정의 : 두개의 주소값이 같냐 -> 재정의후 True
        System.out.println(std1 == std3);   // true

        System.out.println(std1.hashCode());  // 356573597  -> 100
        System.out.println(std2.hashCode());  // 1735600054 -> 100

        System.out.println(System.identityHashCode(std1)); // 진짜 해쉬 코드 반환
        System.out.println(System.identityHashCode(std2));

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());   // 96354
        System.out.println(str2.hashCode());   // 96354


        System.out.println("----------clon---------");

        std1.setStudentName("KIM");
        Student copyStudent = (Student)std1.clone();  // 생성이 아니라 클래스를 그대로 복제할 때 사용 함
        System.out.println(copyStudent);


    }
}
