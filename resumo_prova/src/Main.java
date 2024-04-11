public class Main {
    public static void main(String[] args) {

        Vampiro vampiro = new Vampiro(199, 100, 140, 100, true);
        Zumbi zumbi = new Zumbi(35, 100, 150, 232);
        Monstro monstro = new Monstro(20, 100, 200);

        Feitico feitico[] = new Feitico[10];
        feitico[0] = new Feitico("Avada Kedavra", 95);
        feitico[1] = new Feitico("Imperio", 50);
        Bruxa bruxa = new Bruxa(98, 150, 400, feitico);

        bruxa.listarFeitico();
        bruxa.aprenderFeitico("Alohomora", 60);
        bruxa.listarFeitico();
        bruxa.esquecerFeitico(1);
        bruxa.listarFeitico();
        bruxa.lancarFeitico(monstro, 1);

        monstro.assustar(vampiro);

        vampiro.atacarComMordida(bruxa);
        vampiro.recuperarVida();
        vampiro.assustar(bruxa);
        vampiro.transformar();

    }
}
