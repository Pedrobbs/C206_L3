import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int aux = 0;

        Jogador jogador1 = new Jogador(new Arma(50, 5), 10, 100);
        Jogador jogador2 = new Jogador(new Arma(50, 5), 15, 80);
        Jogador jogador3 = new Jogador(new Arma(50, 5), 5, 60);
        Arma arma = new Arma(50, 5);

        System.out.println("Escolha um jogador: (1)Jogador1  (2)Jogador2 (3)Jogador3 ");
        System.out.print("Digite aqui: ");
        aux = entrada.nextInt();

        if (aux == 1) {
            System.out.println("Jogador1 X Jogador2");
            if (jogador1.energia >= arma.custoDeEnergia) {
                jogador1.atacar(jogador2);
                if (jogador2.vida <= 0) {
                    jogador2.vida = 0;
                    System.out.println("Jogador2 foi derrotado!");
                } else {
                    System.out.println("Vida Jogador1: " + jogador1.vida);
                    System.out.println("Vida Jogador2: " + jogador2.vida);
                }
            } else {
                System.out.println("Energia insuficiente!!!");
            }
            System.out.println(jogador1);

        } else if (aux == 2) {
            System.out.println("Jogador1 X Jogador3");
            if (jogador1.energia >= arma.custoDeEnergia) {
                jogador1.atacar(jogador3);
                if (jogador3.vida <= 0) {
                    jogador3.vida = 0;
                    System.out.println("Jogador3 foi derrotado!");
                } else {
                    System.out.println("Vida Jogador1: " + jogador1.vida);
                    System.out.println("Vida Jogador3: " + jogador3.vida);
                }
            } else {
                System.out.println("Energia insuficiente!!!");
            }
            System.out.println(jogador1);

        } else if (aux == 2) {
            System.out.println("Informações do Jogador2: ");
            System.out.println("Vida: " + jogador2.vida);
            System.out.println("Energia: " + jogador2.energia);

            int aux3 = 0;
            System.out.println("Vamos para o duelo!!!");
            System.out.println("Escolha um jogador para batalhar: (1)Jogador1 (2)Jogador3 ");
            aux3 = entrada.nextInt();

            if (aux3 == 1) {
                System.out.println("Jogador2 X Jogador1");
                if (jogador2.energia >= arma.custoDeEnergia) {
                    jogador2.atacar(jogador1);
                    if (jogador1.vida <= 0) {
                        jogador1.vida = 0;
                        System.out.println("Jogador1 foi derrotado!");
                    } else {
                        System.out.println("Vida Jogador2: " + jogador2.vida);
                        System.out.println("Vida Jogador1: " + jogador1.vida);
                    }
                } else {
                    System.out.println("Energia insuficiente!!!");
                }
                System.out.println(jogador2);

            } else if (aux3 == 2) {
                System.out.println("Jogador2 X Jogador3");
                if (jogador2.energia >= arma.custoDeEnergia) {
                    jogador2.atacar(jogador3);
                    if (jogador3.vida <= 0) {
                        jogador3.vida = 0;
                        System.out.println("Jogador3 foi derrotado!");
                    } else {
                        System.out.println("Vida Jogador2: " + jogador2.vida);
                        System.out.println("Vida Jogador3: " + jogador3.vida);
                    }
                } else {
                    System.out.println("Energia insuficiente!!!");
                }
                System.out.println(jogador2);
            } else {
                System.out.println("Nenhum jogador encontrado!");
            }

        } else if (aux == 3) {
            System.out.println("Informações do Jogador3: ");
            System.out.println("Vida: " + jogador3.vida);
            System.out.println("Energia: " + jogador3.energia);

            int aux4 = 0;
            System.out.println("Vamos para o duelo!!!");
            System.out.println("Escolha um jogador para batalhar: (1)Jogador1 (2)Jogador2 ");
            aux4 = entrada.nextInt();

            if (aux4 == 1) {
                System.out.println("Jogador3 X Jogador1");
                if (jogador3.energia >= arma.custoDeEnergia) {
                    jogador3.atacar(jogador1);
                    if (jogador1.vida <= 0) {
                        jogador1.vida = 0;
                        System.out.println("Jogador1 foi derrotado!");
                    } else {
                        System.out.println("Vida Jogador3: " + jogador3.vida);
                        System.out.println("Vida Jogador1: " + jogador1.vida);
                    }
                } else {
                    System.out.println("Energia insuficiente!!!");
                }
                System.out.println(jogador3);

            } else if (aux4 == 2) {
                System.out.println("Jogador3 X Jogador2");
                if (jogador3.energia >= arma.custoDeEnergia) {
                    jogador3.atacar(jogador2);
                    if (jogador2.vida <= 0) {
                        jogador2.vida = 0;
                        System.out.println("Jogador2 foi derrotado!");
                    } else {
                        System.out.println("Vida Jogador3: " + jogador3.vida);
                        System.out.println("Vida Jogador2: " + jogador2.vida);
                    }
                } else {
                    System.out.println("Energia insuficiente!!!");
                }
                System.out.println(jogador3);
            } else {
                System.out.println("Nenhum jogador encontrado!");
            }
        } else {
            System.out.println("Nenhum jogador encontrado!");
        }
    }
}
