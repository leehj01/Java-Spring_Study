package ch15;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {  // 생성자에서는 맴버변수 초기화하는 일을 많이 함.
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size(); // arraylist 에는 size 라는 메서드를 제공해줌
    }
}
