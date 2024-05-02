
import java.util.ArrayList;

public class Partida {

    ArrayList<Jogador> jogadores = new ArrayList<>();

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void incluir(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void excluir(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void excluir(int index) {
        jogadores.remove(index);
    }

    public void atualizar(Jogador jogador, int index) {
        jogadores.set(index, jogador);
    }

    public Jogador buscar(int index) {
        return jogadores.get(index);
    }

}
