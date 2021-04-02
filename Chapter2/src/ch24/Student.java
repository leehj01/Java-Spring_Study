package ch24;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;

    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);

    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println(" 학생 " + studentName + s.getName() + " 과목의 성적은  " +  s.getScorePoint() + "입니다");
    }
        System.out.println( studentName + "학생의 총점은 " + "total" + "점 입니다. ");
    }
}
