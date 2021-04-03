package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bounsPoint = 1000;
        int pricelee = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + " " + pricelee + "가격");

        Customer customerKim = new VIPCustomer(10020 , "Kim"); // 디폴트 생성자가 사라져서, 오류 발생됨.
        customerKim.bounsPoint = 1000;
        int price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + " " + price + "가격");

        Customer vc = new VIPCustomer(1234, "noname"); // 형변환 가능
        System.out.println( vc.calcPrice(1000)); // 900
    }
}
