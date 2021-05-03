package ch01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ',' + author ;
    }
}


public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만헤세");

        System.out.println(book);   // ch01.Book@1540e19d

        String str = new String("test");
        System.out.println(str);   // test  - 이미 String 에는 toString 되어있어서, 주소값이 아니라 string 값이 나옴
        System.out.println(str.toString());   // test

    }
}
