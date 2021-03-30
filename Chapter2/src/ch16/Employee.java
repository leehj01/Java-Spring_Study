package ch16;

public class Employee {

    // static 변수를 바로 쓰기 위해서 public으로 해놨지만, 시리얼 넘버는 중요하기 때문에 ( 기준이 되는 정보 ) 그래서 , 외부에서 함부로 변하게 하면 안됨 -> private 으로 변경
    public static int serialNum = 1000; // 요아이가 static 메서드 ! 어디서든 쓰이는 아이!

    private int employeeId;
    private String employeeName;
    private String departmet;


    // 생성자
    public Employee(){
        serialNum++;  // 회원이 늘수록, 1개씩 늘어남
        employeeId = serialNum; // 그냥 이걸 반환하면 모든 회원의 아이디가 같으므로, 새로운 지역 변수(?) 에 넣어주기.
    }

    // getSerialNum 을하면, serialNum을 반환하게 되는데, 메서드가 static가 되고, 반환값은 Int 임


    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmet() {
        return departmet;
    }

    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }
}
