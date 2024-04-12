public class BracoArticulado extends Robo {

    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int totalDeRobos, int energiaMaxima, int numeroDeArticulacoes, Garra garra, Camera camera) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = garra;
        this.camera = camera;
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
        camera.acharPecas();
        garra.agarrarPeca(); // não possui posição
        // garra.agarrarPeca(1); // garra com posicao 1
    }
}
