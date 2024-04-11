public class Zumbi extends Monstro {

    private int numeroDeCerebros;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebros) {
        super(idade, vida, energia);
        this.numeroDeCerebros = numeroDeCerebros;
    }

    public void atacarComMordida(Monstro monstroAlvo) {
        int energia_nova = getEnergia();
        int vida_Alvo = monstroAlvo.getVida();

        if (energia_nova >= 20) {
            energia_nova -= 20;
            setEnergia(energia_nova);
            vida_Alvo -= 15;
            monstroAlvo.setVida(vida_Alvo); // Atualiza a vida do monstro alvo
            System.out.println("Vida monstro alvo" + monstroAlvo.getVida());
            System.out.println("Energia: " + getEnergia());
        } else {
            System.out.println("Não possui energia");
        }
    }
}
