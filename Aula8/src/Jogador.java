
public class Jogador implements Comparable<Jogador> {

    private String nome;
    private int numero;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Jogador o) {
        //return Integer.compare(o.numero, this.numero);
        return o.nome.compareTo(this.nome);
    }
}
