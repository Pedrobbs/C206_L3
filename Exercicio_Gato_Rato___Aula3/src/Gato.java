public class Gato {
    private String nome;
    private int idade;
    private int velocidade;


    public void brinca() {
        System.out.println("Gato brincando...");
    }

    public void caçar(Rato rato) {
        if (this.velocidade > rato.getVelocidade() && rato.Escondido() == false) {
            System.out.println(this.nome + " caçou " + rato.nome + "!");
        } else {
            System.out.println(rato.nome + " escapou de " + this.nome + "!");
        }
    }


   /* public Gato(String nome, int idade, int velocidade) {
        this.nome = nome;
        this.idade = idade;
        this.velocidade = velocidade;
    }*/

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", velocidade=" + getVelocidade() +
                '}';
    }
}
