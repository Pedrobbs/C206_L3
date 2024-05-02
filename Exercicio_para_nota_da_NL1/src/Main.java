public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("Ferrari");
        equipe.constroiCarro(3, 500, true);

        Piloto piloto1 = new Piloto("Lewis Hamilton", 35, "Britânico");
        Piloto piloto2 = new Piloto("Sebastian Vettel", 33, "Alemão");
        Piloto piloto3 = new Piloto("Charles Leclerc", 24, "Monegasco");
        Piloto piloto4 = new Piloto("Carlos Sainz", 27, "Espanhol");

        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.adicionarPiloto(piloto3);
        equipe.adicionarPiloto(piloto4);

        equipe.trocarPilotoAtual(1);
        equipe.pitStop(4, 2);

        equipe.retirarPiloto(3);
        equipe.adicionarPiloto(new Piloto("Fernando Alonso", 40, "Espanhol"));

        System.out.println(equipe.toString());


    }
}
