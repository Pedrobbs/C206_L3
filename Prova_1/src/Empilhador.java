public class Empilhador extends Robo {

    private Pacote pacotes[] = new Pacote[10];
    private int pesoMaximo;

    public void adicionaPacote(int peso) {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null) {
                if (peso < pesoMaximo) {
                    pacotes[i] = new Pacote(peso);
                } else {
                    System.out.println("Peso maximo atingido!");
                }
            } else {
                System.out.println("Não é possivel adicionar mais pacotes!");
            }
            break;
        }
    }

    public void removePacote(int posicao) {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null) {
                pacotes[posicao] = null;
                System.out.println("Pacote removido com sucesso!");
            } else {
                System.out.println("Pacote na posicao " + i + " esta vazio!");
            }
            break;
        }
    }

    public void mostraPacotes() {
        System.out.println("Mostrando pacotes: " + pacotes);
    }

    public Empilhador(int energia, String nome, int totalDeRobos, int energiaMaxima, Pacote[] pacotes, int pesoMaximo) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.pacotes = pacotes;
        this.pesoMaximo = pesoMaximo;
    }
}

