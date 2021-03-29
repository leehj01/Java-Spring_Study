package ch09;

public class Student {

    int studentID;
    String studentName; // String 은 new를 안적어줘도 됨

    Subject koreaclass; // subject는 적어줘야한다.
    Subject math;

    public Student(int id, String name){
        studentID = id;   // 왜 여기에는 this 를 사용하지 않을까? - 상관이 없다.
        studentName = name;

        koreaclass = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score ){
        koreaclass.subjectName = name;
        koreaclass.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName= name ;
        math.score = score;
    }

    public void showStudentScore(){
        int total = koreaclass.score + math.score;
        System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다.");
    }
}
