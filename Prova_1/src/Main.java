 public class Main {
    public static void main(String[] args) {

        Robo robo = new Robo(100, "Robo Tecnologico", 12, 200);
        BracoArticulado bracoArticulado = new BracoArticulado(200, "Braço Articulado 2k", 1, 100, 8, new Garra(20), new Camera(4000));
        Empilhador empilhador = new Empilhador(100, "Empilhadeira", 1, 200, 2, 2);

        // Chamando metodos de robo
        robo.trabalhar();
        robo.recarregar(30);
        robo.trocarEnergia(robo);

        System.out.println();

        // Chamando metodos de BracoArticulado
        bracoArticulado.trabalhar();

        System.out.println();

        // Chamando metodos de empilhador
        empilhador.adicionaPacote(50);
        empilhador.mostraPacotes();
        empilhador.removePacote(1);

    }
}