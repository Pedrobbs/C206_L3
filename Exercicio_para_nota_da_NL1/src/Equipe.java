import java.util.Arrays;

class Equipe {
    private Carro carro;
    private Piloto[] pilotos;
    private Piloto pilotoAtual;
    private String nome;

    public Equipe(String nome) {
        this.nome = nome;
        this.pilotos = new Piloto[4];
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo) {
        this.carro = new Carro(tipoDePneu, potencia, turbo);
    }

    public boolean adicionarPiloto(Piloto piloto) {
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] == null) {
                pilotos[i] = piloto;
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto(int id) {
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] != null && pilotos[i].getId() == id) {
                pilotos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean trocarPilotoAtual(int id) {
        for (Piloto piloto : pilotos) {
            if (piloto != null && piloto.getId() == id) {
                this.pilotoAtual = piloto;
                return true;
            }
        }
        return false;
    }

    public void pitStop(int tipoDePneu, int id) {
        if (trocarPilotoAtual(id) && trocarPneu(tipoDePneu)) {
            System.out.println("Pit stop realizado com sucesso!");
        } else {
            System.out.println("Erro ao realizar pit stop.");
        }
    }

    public boolean trocarPneu(int tipoDePneu) {
        if (tipoDePneu >= 1 && tipoDePneu <= 5) {
            this.carro.setTipoDePneu(tipoDePneu);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Equipe " + nome + "\n" +
                "Carro: " + carro.toString() + "\n" +
                "Pilotos: " + Arrays.toString(pilotos) + "\n" +
                "Piloto atual: " + pilotoAtual.toString();
    }
}