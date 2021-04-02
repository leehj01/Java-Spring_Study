package ch02;

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

    // 생성자
    public VIPCustomer(){
        customerGrade = "VIP"; // 상속을 받으려니깐, 오류발생 - 왜냐면 , privite 이기 때문 - 클래스 내부에만 사용
                                // 하지만 상속관계에서는 사용할일이 많음. - 외부는 못해도 하위는 접근 가능하게 해랏 -> protected로 변경
        bounsRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
