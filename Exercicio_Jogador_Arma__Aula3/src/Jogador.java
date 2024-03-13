public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    public Jogador() {
        this.arma = new Arma(50, 15);
        this.energia = 100;
        this.vida = 100;
    }

    public Jogador(Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public void atacar(Jogador alvo) {
        if (this.energia >= this.arma.getCustoDeEnergia()) {
            alvo.setVida(alvo.getVida() - this.arma.getDano());
            this.setEnergia(this.energia - this.arma.getCustoDeEnergia());
        }
    }

    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + arma +
                ", energia=" + energia +
                ", vida=" + vida +
                '}';
    }
}