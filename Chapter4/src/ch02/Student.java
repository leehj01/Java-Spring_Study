package ch02;

public class Student implements Cloneable{

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public String toString(){
        return studentId + "," + studentName;
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
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
