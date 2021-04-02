package ch03;

//매출에 더 많은 기여를 하는 단골 고객
//제품을 살때 10%를 할인해 줌
//보너스 포인트는 제품 가격의 5%를 적립해 줌
//담당 전문 상담원이 배정됨

public class VIPCustomer extends Customer {

    private  int agentID;  // 담당하는 상담원 아이디
    double salesRatio;

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    // customer 구현되 내용이 중복이므로 customer를 확장하여 구현함 ( 상속 ) - 상속받았기 때문에, 이미 있는 변수는 초기화 안해두됨

//    // 생성자호출
//    public VIPCustomer(){
//        super(0,"no-name");
//        customerGrade = "VIP";
//        bounsRatio = 0.05;
//        salesRatio = 0.1;
//        System.out.println("Vipcustomer() call"); // 얘가 불렸을때 출력되는 로그
//    }

    // 생성자를 안쓰고 이렇게 써도 가능
    public VIPCustomer(int customerID, String cutomerName){
        super(customerID, cutomerName);
        customerGrade = "VIP";
        bounsRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("Vipcustomer(int, string) call"); // 얘가 불렸을때 출력되는 로그
    }

    public int getAgentID(){
        return agentID;
    }
}
