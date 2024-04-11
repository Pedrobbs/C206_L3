public class Monstro {

    private int idade;
    private int vida;
    private int energia;

    public void assustar(Monstro mostroAlvo) {
        System.out.printf("Monstro assustando " + mostroAlvo);
    }

    public Monstro(int idade, int vida, int energia) {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
}