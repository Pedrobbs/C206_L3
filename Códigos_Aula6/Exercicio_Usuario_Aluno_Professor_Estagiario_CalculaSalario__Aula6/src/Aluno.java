public class Aluno extends Usuario {

    private int notas[];

    public Aluno(int id, int senha) {
        super(id, senha);
    }

    public void mostraInfo() {
        System.out.println("Notas: " + notas);
    }
}
