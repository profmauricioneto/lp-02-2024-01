package classrelationship.manytomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 123);
        Professor tiago = new Professor("Tiago", 321);

        Disciplina poo = new Disciplina("Oriented Object Programming", 100);
        Disciplina projetos = new Disciplina("Integrated Projects", 101);
        Disciplina datavis = new Disciplina("Data Visualization", 103);

        mauricio.addDisciplinas(poo);
        mauricio.addDisciplinas(datavis);
        mauricio.addDisciplinas(projetos);

        poo.addProfessor(mauricio);
        datavis.addProfessor(mauricio);
        projetos.addProfessor(mauricio);

        tiago.addDisciplinas(projetos);
        projetos.addProfessor(tiago);

        // ========== saida mauricio
        System.out.println("Professor: " + mauricio.getNomeProfessor());
        System.out.println("Disciplinas: ");
        mauricio.mostrarDisciplinasMinistradas();

        System.out.println("");
        // ========== saida tiago
        System.out.println("Professor: " + tiago.getNomeProfessor());
        System.out.println("Disciplinas: ");
        tiago.mostrarDisciplinasMinistradas();

        System.out.println("");
        // ========== saida disciplina
        System.out.println("Disciplina: " + projetos.getNomeDisciplina());
        System.out.println("Professores: ");
        projetos.mostrarProfessoresDaDisciplina();
    }
}
