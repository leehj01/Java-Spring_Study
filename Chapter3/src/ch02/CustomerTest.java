package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("lee");
        customerLee.setCustomerID(10010);
        customerLee.bounsPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        Customer customerKim = new VIPCustomer();
        customerKim.setCustomerName("Kim");
        customerKim.setCustomerID(10020);
        customerKim.bounsPoint = 1000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
