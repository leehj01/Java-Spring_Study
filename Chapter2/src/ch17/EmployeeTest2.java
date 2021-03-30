package ch17;

import ch16.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        System.out.println(Employee.getSerialNum());
        Employee.setSerialNum(1003);
        System.out.println(ch17.Employee.getSerialNum());
    }
}
