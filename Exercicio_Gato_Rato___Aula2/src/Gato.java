public class Gato {
    public String nome;
    public int idade;
    public int velocidade;


    public void brinca() {
        System.out.println("Gato brincando...");
    }

    public void caçar(Rato rato) {
        if (this.velocidade > rato.velocidade && rato.escondido == false) {
            System.out.println(this.nome + " caçou " + rato.nome + "!");
        } else {
            System.out.println(rato.nome + " escapou de " + this.nome + "!");
        }
    }


    public Gato(String nome, int idade, int velocidade) {
        this.nome = nome;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", velocidade=" + velocidade +
                '}';
    }
}
