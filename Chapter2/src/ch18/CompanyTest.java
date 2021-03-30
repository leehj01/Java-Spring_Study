package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // 인스턴스를 만들지 않고, 바로 가져다 쓸것 이기 때문에 statics
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1); // ch18.Company@1540e19d
        System.out.println(company2); // ch18.Company@1540e19d - 같음


        // 날짜가 필요할때, 자바에서 util에서 제공해줌. - static 이므로, new 안됨. - 유일한 객체를 제공함
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
