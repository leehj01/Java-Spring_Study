package ch21;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        // 객체를 생성해서 각 배열의 요소 넣기 - 안넣으면 null 이 뜸
        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        for(int i = 0 ; i <library.length ; i++){
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
