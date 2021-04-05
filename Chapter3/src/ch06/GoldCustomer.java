package ch06;
//제품을 살때는 10프로를 할인해준다
//보너스 포인트는 2%를 적립해준다
public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);

        salesRatio = 0.1;
        bounsRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calcPrice(int price){
        bounsPoint += price * bounsRatio;
        return price - (int)(price * salesRatio);
    }

}
