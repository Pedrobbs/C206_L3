import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Partida partida = new Partida();

        Jogador jog = new Jogador("bbb", 121);

        partida.incluir(new Jogador("aa", 10));
        partida.incluir(jog);
        partida.incluir(new Jogador("ab", 12));

        System.out.println(partida.getJogadores());

        //partida.atualizar(jog, 1);
        //partida.excluir(jog);
        //partida.excluir(0);

        Collections.sort(partida.getJogadores());


        System.out.println(partida.getJogadores());

        //System.out.println(partida.getJogadores().size());
    }
}