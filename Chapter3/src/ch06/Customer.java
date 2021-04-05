package ch06;
//일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bounsPoint;
    double bounsRatio;

//    //생성자 만들기
//    public Customer(){
//        customerGrade = "BASIC";
//        bounsRatio = 0.01;
//
//        System.out.println("customer() call"); // 얘가 불렸을때 출력되는 로그
//    }

    // 디폴트 생성자는 삭제하고 , 아래처럼 만들어주면 하위 클래스 오류가 발생함.
    // super 가 호출할 애가 없어지기 때문 .
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
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
