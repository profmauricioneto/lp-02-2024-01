package classrelationship.onetoone;

public class Main {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Oriented Object Programing", 100);
        Disciplina lp1 = new Disciplina("Programming Language 1", 101);

        Professor mauricio = new Professor("Maurício Neto", 123, poo);
        poo.setProfessor(mauricio);

        System.out.println("Disciplina:");
        System.out.println(poo.getNomeDisciplina());
        System.out.println("Professor: " + poo.getNomeProfessor());
    }
}
