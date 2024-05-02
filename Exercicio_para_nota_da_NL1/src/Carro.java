class Carro {
    private int tipoDePneu;
    private int potencia;
    private boolean turbo;
    private Motor motor;

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.tipoDePneu = tipoDePneu;
        this.potencia = potencia;
        this.turbo = turbo;
        this.motor = new Motor(potencia, turbo);
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "Carro [tipoDePneu=" + tipoDePneu + ", potencia=" + potencia + ", turbo=" + turbo + "]";
    }
}
