public class Produto {
    private double valor;
    private String nome;

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
