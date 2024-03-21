package abstractclass.exercise02;

public class ProjectManager extends Employee {
    public ProjectManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        double value = getSalary() + 1000;
        System.out.println("Salary of " + getName() + " : "  + value);
    }
}
