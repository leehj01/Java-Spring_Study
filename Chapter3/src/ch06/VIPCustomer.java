package ch06;

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



    // 생성자를 안쓰고 이렇게 써도 가능
    public VIPCustomer(int customerID, String cutomerName){
        super(customerID, cutomerName);
        customerGrade = "VIP";
        bounsRatio = 0.05;
        salesRatio = 0.1;

    }

    @Override  // 컴파일에게 정보를 제공해주는 역할
    public int calcPrice(int price) {
        bounsPoint += price * bounsRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public int getAgentID(){

        return agentID;
    }
}
