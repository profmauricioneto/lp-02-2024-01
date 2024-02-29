package classrelationship.exercise01;

public class Main {
    public static void main(String[] args) {
        Universidade unichristus = new Universidade("Unichristus", "Centro Universitário Christus");

        Curso si = new Curso("Sistemas de Informação", 1234, unichristus);
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 4321, unichristus);

        Estudante raphael = new Estudante("Raphael", "123456");
        Estudante filipe = new Estudante("Filipe", "78901");
        Estudante samara = new Estudante("Samara", "987654");
        Estudante eduardo = new Estudante("Eduardo", "4567834");

        // relacao curso-universidade
        unichristus.addCurso(si);
        unichristus.addCurso(ads);

        // relacao aluno-curso
        ads.addEstudante(raphael);
        ads.addEstudante(filipe);
        si.addEstudante(samara);
        si.addEstudante(eduardo);

        System.out.println("Universidade: " + unichristus.getNomeUniversidade());
        System.out.println("Qtd de Cursos: " + unichristus.getTotalCursos());
        System.out.println("Cursos: ");
        unichristus.showNomeDosCursos();
        System.out.println("Qtd total de alunos na universidade: " + unichristus.getTotalAlunosUniversidade());

    }
}
