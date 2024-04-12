public class Garra {

    private int pressao;

    public void agarrarPeca() {
        System.out.println("Agarrando a peça padrão!");
    }

    public void agarrarPeca(int posicao) {
        System.out.println("Agarrando peca na posicao " + posicao);
    }

    public Garra(int pressao) {
        this.pressao = pressao;
    }
}

