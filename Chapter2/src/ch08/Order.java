package ch08;

public class Order {
    public String ordernum;
    public String orderPhonenum;
    public String orderAddress;
    public String orderDate;
    public int orderTime;
    public int orderprice;
    public int manuNum;

    public Order(String ordernum, String orderPhonenum, String orderAddress, String orderDate, int orderTime, int orderprice, int manuNum){
        this.ordernum = ordernum;
        this.orderPhonenum = orderPhonenum;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderprice = orderprice;
        this.manuNum = manuNum;
    }

    public void showorderinfo(){
        System.out.println("주문 접수 번호 : " + ordernum );
        System.out.println("주문 핸드폰 번호 : " + orderPhonenum);
        System.out.println("주문 집 주소 : " + orderAddress );
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + orderprice);
        System.out.println("메뉴 번호 : " + manuNum);
    }
}
