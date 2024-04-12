public class Pacote {
    private int peso;

    public void Pacote(int peso, int pesoMaximo) {
        if (peso > pesoMaximo) {
            System.out.println("Não é possivel adicionar mais peso!");
        } else {
            Pacote pacote = new Pacote(50);
        }
    }

    public Pacote(int peso) {
        this.peso = peso;
    }
}
