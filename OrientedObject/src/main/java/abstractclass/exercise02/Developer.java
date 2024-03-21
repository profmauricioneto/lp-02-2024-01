package abstractclass.exercise02;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        double value = getSalary() + 5000;
        System.out.println("Salary of " + getName() + " : "  + value);
    }
}
