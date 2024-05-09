import java.util.ArrayList;
import java.util.Arrays;

public class Cozinheiro extends Pirata {

    private ArrayList<Receita> livroDeReceita = new ArrayList();

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public String prepararPrato(int index) {
        return livroDeReceita.toString();
    }
    public void mostraReceita() {
        try {
            System.out.println("Lista De Receita -> " + Arrays.toString(livroDeReceita.toArray()));
        } catch (Exception e) {
            System.out.println("Erro ->  " + e);
        }
    }

}
