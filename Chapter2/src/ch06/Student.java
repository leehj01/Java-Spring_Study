package ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

//    public Student(){} // 디폴트 생성자가 만들어질 수 있음
    public Student(int studentNumber, String studentName, int grade){
        // 변수이름을 같게해야 편해지만, this를 이용해서 멤버변수라는 것을 명확시 해줌
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showstudentinfo(){
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }

}
