public class Bruxa extends Monstro {

    private Feitico feitico[];

    public Bruxa(int idade, int vida, int energia, Feitico[] feitico) {
        super(idade, vida, energia);
        this.feitico = feitico;
    }

    public boolean aprenderFeitico(String nome, int poder) {
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] == null) {
                feitico[i] = new Feitico(nome, poder);
                return true;
            }
        }
        return false;
    }

    public void listarFeitico() {
        System.out.printf("Feiticos Aprendidos: ");
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null) {
                System.out.println("Nome: " + feitico[i].getNome() + ", Poder: " + feitico[i].getPoder());
            } else {
                System.out.println("Feitiço na posição " + i + " está vazio.");
            }
            break;
        }
    }

    public void esquecerFeitico(int posicao) {
        if (feitico[posicao] == null) {
            System.out.printf("Nenhum feitico nessa posição");
        } else {
            System.out.println("Feitico " + feitico[posicao].getNome() + " foi esquecido.");
            feitico[posicao] = null;
        }
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao) {
        int energia_nova = getEnergia();
        if (energia_nova >= 20) {
            energia_nova -= 20;
            monstroAlvo.setEnergia(energia_nova);
            for (int i = 0; i < feitico.length; i++) {
                if (feitico[posicao] == null) {
                    int vida_nova = monstroAlvo.getVida();
                    vida_nova -= feitico[posicao].getPoder();
                    System.out.printf("Vida do alvo: " + vida_nova);
                    System.out.printf("Sem ataque");
                }
            }
        } else {
            System.out.printf("Não tem energia!");
        }
    }
}
