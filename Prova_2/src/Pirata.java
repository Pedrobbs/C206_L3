public class Pirata {

    private String nome;
    private String comidaFavorita;
    private int poder;

    public void comer(Cozinheiro cozinheiro, int index) {
        int poder_aumentado = 0;
        System.out.println(cozinheiro.getNome() + " está preparando o prato...");
        poder_aumentado = poder + 1;
        System.out.println("Poder aumentado para " + poder_aumentado);
    }

    public void lutar(Pirata pirata) {
        if (pirata.poder > poder)
            System.out.println("Pirata -> " + pirata.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }
}
