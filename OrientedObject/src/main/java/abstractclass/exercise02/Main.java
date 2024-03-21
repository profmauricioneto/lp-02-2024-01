package abstractclass.exercise02;

public class Main {
    public static void main(String[] args) {
        Employee manager = new ProjectManager("Joaozinho", 5000);
        Employee dev = new Developer("Raphael", 4000);

        manager.increaseSalary();
        dev.increaseSalary();
    }
}
