public class Rato {

    public float velocidade;
    public boolean escondido;
    public String nome;


    public void esconder() {
        escondido = true;
    }

    public void procuraComida() {
        escondido = false;
    }

    public Rato(String nome, float velocidade, boolean escondido) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.escondido = escondido;
    }

    @Override
    public String toString() {
        return "Rato{" +
                "nome='" + nome + '\'' +
                ", velocidade=" + velocidade +
                ", escondido=" + escondido +
                '}';
    }
}

