package ch17;

import ch16.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        ch16.Employee employeeLee = new ch16.Employee(); // 지역 변수 - 스택 메모리에 생김
        employeeLee.setEmployeeName("도레미");

//        System.out.println(employeeLee.serialNum);  - 프라이빗으로 바꿨기 때문에 이렇게 하면 오류남
        System.out.println(Employee.getSerialNum());

        ch16.Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("파솔라");

        System.out.println(employeeLee.getEmployeeName() +"님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
    }
}
