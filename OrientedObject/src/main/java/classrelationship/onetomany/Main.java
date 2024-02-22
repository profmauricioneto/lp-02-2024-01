package classrelationship.onetomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Maurício Moreira", 123);

        Disciplina poo = new Disciplina("Oriented Object Programming", 100, mauricio);
        Disciplina lp1 = new Disciplina("Programming Language 1", 101, mauricio);
        Disciplina datavis = new Disciplina("Data Visualization", 102, mauricio);

        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(lp1);
        mauricio.addDisciplina(datavis);

        System.out.println("Professor: " + mauricio.getNomeProfessor());
        System.out.println("Disciplinas: ");
        mauricio.showAllDisciplinas();
    }
}
