package ch06;

public class StudentTest {
    public static void main(String[] args) {
        // Student studentLee = new Student();
        // 위에가 오류가 발생한 이유는, public Student() 안에 값을 집어넣었기때문,
        // 단순히 위에 처럼 실행하려면 값안에 아무것도 없어야 디폴트 생성자가 만들어짐

        Student studentLee = new Student(12345, "LEE", 3);
        String data = studentLee.showstudentinfo();
        System.out.println(data);
        // 아무런 정보를 주지 않으면 null학생의 학번은0이고, 0학년 입니다. 이 반환됨
    }
}
