package classrelationship.onetoone;

/**
 * Crie um programa que implemente uma classe Disciplina que possui os atributos: nome da disciplina e código.
 * A classe Disciplina deve conter um construtor para inicializar os atributos, um método que retorne o seu nome,
 * um método para adicionar um professor a disciplina e um método para retornar o nome do professor (caso tenha).
 * Implemente também uma classe Professor que possui os atributos nome_professor e id.
 * A classe Professor deve possuir um construtor para inicializar os atributos.
 * Uma disciplina pode possuir nenhum ou pelo menos um professor responsável.
 * */

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
