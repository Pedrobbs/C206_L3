import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Tom", 5, 80);
        Rato rato = new Rato("Jerry", 60f, true);

        gato.brinca();
        System.out.println();

        rato.procuraComida();       // Mudando escondido = false
        System.out.println(rato.nome + " esta escondido...");
        gato.caçar(rato);

        System.out.println();

        rato.esconder();       // Mudando escondido = true
        System.out.println(rato.nome + " esta procurando comida...");
        gato.caçar(rato);

        System.out.println();

        System.out.println("Informações:");
        System.out.println(gato.toString());
        System.out.println(rato.toString());

    }
}