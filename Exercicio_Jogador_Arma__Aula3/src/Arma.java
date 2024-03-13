public class Arma {

    private int dano;
    public int custoDeEnergia;

    public Arma(int dano, int custoDeEnergia) {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getCustoDeEnergia() {
        return custoDeEnergia;
    }
    public void setCustoDeEnergia(int custoDeEnergia) {
        this.custoDeEnergia = custoDeEnergia;
    }
}