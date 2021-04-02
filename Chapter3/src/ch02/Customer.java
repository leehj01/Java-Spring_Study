package ch02;
//일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bounsPoint;
    double bounsRatio;

    //생성자 만들기
    public Customer(){
        customerGrade = "BASIC";
        bounsRatio = 0.01;
    }

    public int calcPrice(int price){
        bounsPoint += price * bounsRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bounsPoint + "입니다.";
    }
}
