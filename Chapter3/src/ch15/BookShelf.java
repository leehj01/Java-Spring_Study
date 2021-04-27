package ch15;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();  // public int getCount()  로 이미 Shelf 에서 구현되어있음.
    }
}
