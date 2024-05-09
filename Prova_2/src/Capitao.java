public class Capitao extends Pirata implements Comandar {

    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public void conquistarNovoSeguidor(Pirata pirata) {
        if(pirata.getPoder() > super.getPoder()){
            numeroDeSeguidores += 1;
        }
        else{
            System.out.println("Não foi possivel entrar, o capitão tem mais poder!!!");
        }
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes." );
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão esta mudando a rota.");
    }
}
