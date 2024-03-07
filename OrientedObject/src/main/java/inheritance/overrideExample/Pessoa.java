package inheritance.overrideExample;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
