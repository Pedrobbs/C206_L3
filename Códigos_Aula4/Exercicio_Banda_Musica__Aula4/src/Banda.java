public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int numeroDeIntegrantes;

    public void tocarMusica(int posicao) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println("Tocando a musica: " + musicas[i].getNome());
            }
        }
    }

    public void tocarShow() {
        System.out.println("Tocando...");
    }

    public boolean adicionarMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                break;
            }
        }
        return false;
    }

    public boolean deletarMusica(String nome) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                musicas[i] = null;
                break;
            }
        }
        return false;
    }

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }

    public Musica[] getMusicas() {
        return musicas;
    }
    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }
    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
