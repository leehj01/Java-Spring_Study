package ch15;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("토지1");
        bookQueue.enQueue("토지2");
        bookQueue.enQueue("토지3");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());  // 이걸 부를때마다 한권씩 제거가 되면서 꺼내짐
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

    }
}
