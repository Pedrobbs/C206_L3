public class Console extends Produto {
    private String geracao;
    private String marca;

    public void jogar() {
        System.out.println("Jogando...");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Geração: " + geracao);
        System.out.println("Marca: " + marca);
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
