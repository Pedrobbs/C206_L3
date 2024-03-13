public class Rato {

    private float velocidade;
    private boolean escondido;
    public String nome;

    public void esconder() {
        escondido = true;
    }

    public void procuraComida() {
        escondido = false;
    }

    /*public Rato(String nome, float velocidade, boolean escondido) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.escondido = escondido;
    }*/

    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public boolean Escondido() {
        return escondido;
    }
    public void setEscondido(boolean escondido) {
        this.escondido = escondido;
    }

    @Override
    public String toString() {
        return "Rato{" +
                "nome='" + nome + '\'' +
                ", velocidade=" + getVelocidade() +
                ", escondido=" + Escondido() +
                '}';
    }
}

