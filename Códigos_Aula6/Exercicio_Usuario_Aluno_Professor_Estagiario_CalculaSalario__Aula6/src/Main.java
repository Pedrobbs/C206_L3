public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, 1010);
        Professor professor = new Professor(2, 2020, 10, 8);
        Estagiario estagiario = new Estagiario(3, 3030, 6);

        // chamando o metodo logar para as classe filhas
        System.out.print("Aluno");
        aluno.logar();
        System.out.print("Professor");
        professor.logar();
        System.out.print("Estagiario");
        estagiario.logar();

        System.out.println();

        // calculando salario para PROFESSOR E ESTAGIARIO
        System.out.println("Salarios: ");
        System.out.println("Professor: " + professor.calcularSalario() + " R$"); // salario multiplicado por 12,27
        System.out.println("Estagiario: " + estagiario.calcularSalario() + "R$"); // salario multiplicado por 11,20
        System.out.println();

        // mostrando todas as informações
        System.out.println("Info Aluno: ");
        aluno.mostraInfo();

        System.out.println();

        System.out.println("Info Professor: ");
        professor.mostraInfo();

        System.out.println();

        System.out.println("Info Estagiario: ");
        estagiario.mostraInfo();

    }
}