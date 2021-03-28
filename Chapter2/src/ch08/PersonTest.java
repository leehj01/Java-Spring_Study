package ch08;

public class PersonTest {
    public static void main(String[] args) {
        Person persintomas = new Person(
                180, 78,"남성",
                "Tomas",37
        );

        System.out.println(persintomas.showPersoninfo());
    }
}
