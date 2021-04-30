package ch15;

public interface Queue {

    void enQueue(String title);
    String deQueue();  //  꺼내게 되면 책의 이름을 반환하도록 해줌

    int getSize();
}
