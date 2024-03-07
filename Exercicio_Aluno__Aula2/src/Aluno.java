import java.util.Scanner;

public class Aluno {

    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;

    public int calculaMedia(){
        int media = (np1+np2)/2;

        if(media < 60) {
            System.out.println("Aluno(a) ficou de recuperação!");
            calculaNp3(media);
        }
        return media;
    }

    public int calculaNp3(int media){
        Scanner entrada = new Scanner(System.in);
        int np3;
        System.out.print("Qual a nota da NP3: ");
        np3 = entrada.nextInt();
        if((media + np3)/2 >= 50){
            System.out.println("Aluno(a) Aprovado!!!");
        }
        else{
            System.out.println("Aluno(a) Reprovado!!!");
        }
        return np3;

    }

    @Override
    public String toString() {
        return "Informações do Aluno{" +
                "Matricula=" + matricula +
                ", NP1=" + np1 +
                ", NP2=" + np2 +
                ", Periodo=" + periodo +
                ", Nome='" + nome + '\'' +
                '}';
    }
}
