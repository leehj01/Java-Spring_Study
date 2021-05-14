package ch04;

public class Person {

    private String name;
    private int aget;

    public Person(String name, int aget) {
        this.name = name;
        this.aget = aget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAget() {
        return aget;
    }

    public void setAget(int aget) {
        this.aget = aget;
    }

    public String toString(){
        return name;

    }
}
