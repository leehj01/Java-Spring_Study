package ch18;

public class Company {

    // 회사이름은 단하나 이기 때문에, static으로 만듦
    private static Company instance = new Company();

    // 외부에서 회사를 마음대로 new 할수없도록 private를 만듦
    private Company(){

    }

    // static 을 넣어줘야 외부에서 아래 이름을 써어줄수 있음 .
    // 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
    public static Company getInstance() {
        if (instance == null){
            instance = new Company(); // 혹시 몰라서 넣은 방어적인 코드
        }
        return instance;
    }


}
