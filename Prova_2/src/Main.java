public class Main {
    public static void main(String[] args) {

        Pirata pirata = new Pirata("Pirata", "Bife", 3);
        Capitao capitao = new Capitao("Capitão", "Lagosta", 5);
        Espadachim espadachim = new Espadachim("Espadachim", "Peixe", 4);
        Cozinheiro cozinheiro = new Cozinheiro("Cozinheiro", "Lasanha", 2);

        pirata.lutar(pirata);
        pirata.comer(cozinheiro, 1);

        capitao.conquistarNovoSeguidor(pirata);

        cozinheiro.prepararPrato(1);
        cozinheiro.mostraReceita();

        espadachim.darOrdens();
        espadachim.mudarRota();
        capitao.darOrdens();
        capitao.mudarRota();

        espadachim.lutar(pirata);
    }
}