public class Jogador {

    Arma arma;
    public int energia;
    public int vida;

    public void atacar(Jogador alvo) {
        if (this.energia >= arma.custoDeEnergia) {
            alvo.vida -= arma.dano;
            this.energia -= arma.custoDeEnergia;
        }
    }

    public Jogador() {
        System.out.println("Entrando em campo...");
    }

    public Jogador(Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + arma.dano +
                ", energia=" + energia +
                ", vida=" + vida +
                '}';
    }
}
