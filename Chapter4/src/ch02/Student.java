package ch02;

public class Student {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString(){
        return studentName + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student){
            Student std = (Student) obj; // 다운 캐스팅
            if ( this.studentId  == std.studentId )
                return true;
            else return false;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
