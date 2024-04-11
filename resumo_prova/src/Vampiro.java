public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = false;
    }

    public boolean transformar() {
        if (formaDeMorcego) {
            System.out.println("Vampiro virando morcego!");
            return true;
        }
        return false;
    }

    public void recuperarVida() {
            int vidaRecuperada = 30;
            if (getVida() + vidaRecuperada <= 100) {
                setVida(vidaRecuperada);
                System.out.println("O vampiro se alimentou e recuperou vida!");
            } else {
                System.out.println("O vampiro está com vida máxima!");
            }
    }

    public void atacarComMordida(Monstro monstroAlvo) {
        int energia_nova = getEnergia();
        energia_nova -= 20;
        if (energia_nova >= 20) {
            int vidaalvo = monstroAlvo.getVida();
            vidaalvo -= 10;
            monstroAlvo.setVida(vidaalvo);
            System.out.println("Ataque efetuado com sucesso!");
        } else {
            System.out.println("Não possui energia para efetuar o ataque!");
        }
    }
}
