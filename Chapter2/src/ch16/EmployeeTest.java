package ch16;
// 회사원이 입사할 때마다 새로운 사번 부여하기.
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee(); // 지역 변수 - 스택 메모리에 생김
        employeeLee.setEmployeeName("도레미");

        System.out.println(employeeLee.serialNum); //

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("파솔라");

        System.out.println(employeeLee.getEmployeeName() +"님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
    }
}
