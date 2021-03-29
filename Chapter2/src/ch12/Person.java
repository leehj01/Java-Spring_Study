package ch12;

public class Person {
    String name;
    int age;

    // 생성자에서 다른 생성자를 호출하는 this
    public Person(){
        this("이름 없음", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 자신의 주소를 반환하는 this
    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "james";
        p1.age = 37;

        Person p2 = p1.getPerson();
        System.out.println(p1);
        System.out.println(p2);
    }
}
