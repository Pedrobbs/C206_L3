import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Qual o seu nome(a): ");
        aluno.nome = entrada.next();
        System.out.print("Digite a nota da NP1 e NP2: ");
        aluno.np1 = entrada.nextInt();
        aluno.np2 = entrada.nextInt();
        System.out.print("Em qual periodo você esta: ");
        aluno.periodo = entrada.nextInt();
        System.out.print("Qual o número da sua matricula: ");
        aluno.matricula = entrada.nextInt();

        aluno.calculaMedia();
        System.out.println(aluno);



    }
}