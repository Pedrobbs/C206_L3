public class Main {
    public static void main(String[] args) {
        Arma customArma = new Arma(10, 5);
        Jogador jogador1 = new Jogador(customArma, 10, 100);
        Jogador jogador2 = new Jogador(customArma, 20, 80);

        System.out.println("Antes: ");
        System.out.println("Jogador 1: " + jogador1.getVida());
        System.out.println("Jogador 2: " + jogador2.getVida());
        jogador1.atacar(jogador2);
        System.out.println("Depois: ");
        System.out.println("Jogador 1: " + jogador1.getVida());
        System.out.println("Jogador 2: " + jogador2.getVida());



    }
}