package ch04;
// student 를 사용하는 class
public class StudentTest {
    public static void main(String[] args) {
        // int 이런거 안적고, 바로 적어두됨. - student 자체가 데이터 타입
        Student studentLee = new Student(); // student 하나를 생성해라
        studentLee.studentID = 12345;
        studentLee.setStudentName("lee");
        studentLee.address = "서울시 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 534321;
        studentKim.studentName = "KIM";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
    }
}
