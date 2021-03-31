package ch21;

public class ObjectCopyTest{
        public static void main(String[] args) {
            Book[] library = new Book[5];
            Book[] copylibrary = new Book[5];

            // 객체를 생성해서 각 배열의 요소 넣기 - 안넣으면 null 이 뜸
            library[0] = new Book("태백산맥1","조정래");
            library[1] = new Book("태백산맥2","조정래");
            library[2] = new Book("태백산맥3","조정래");
            library[3] = new Book("태백산맥4","조정래");
            library[4] = new Book("태백산맥5","조정래");

            // 기준점 ~에서, 목적지 ~ 까지 , 얼만큼
            System.arraycopy(library, 0, copylibrary , 0, 5);

            System.out.println("=========copy library=======");
            for ( Book book : copylibrary){
                book.showBookInfo();
            }

            library[0].setAuthor("박원서");
            library[0].setTitle("나목");

            // 배열이 주소값까지 같음
            System.out.println("=========library=======");
            for ( Book book : library){
                book.showBookInfo();
                System.out.println(book);
            }

            System.out.println("=========copy library=======");
            for ( Book book : copylibrary){
                book.showBookInfo();
                System.out.println(book);
            }


        }
}
