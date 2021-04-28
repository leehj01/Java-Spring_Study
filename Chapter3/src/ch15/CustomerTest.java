package ch15;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();


        Buy buyer = customer; // 묵시적으로 형변환 되는것
        buyer.buy();
        buyer.order();


        Sell seller = customer; // sell 에서 정의된 메서드만 호출 가능하다.
        seller.sell();
        seller.order();

    }
}
