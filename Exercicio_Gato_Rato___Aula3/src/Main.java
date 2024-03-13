import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Rato rato = new Rato();

        gato.setNome("Tom");
        gato.setIdade(5);
        gato.setVelocidade(80);

        rato.nome = "Jerry";
        rato.setVelocidade(60f);
        rato.setEscondido(true);

        gato.brinca();
        System.out.println();

        rato.esconder();       // Mudando escondido = true
        System.out.println(rato.nome + " esta escondido...");
        gato.caçar(rato);

        System.out.println();


        rato.procuraComida();       // Mudando escondido = false
        System.out.println(rato.nome + " esta procurando comida...");
        gato.caçar(rato);

        System.out.println();

        System.out.println("Informações:");
        System.out.println(gato.toString());
        System.out.println(rato.toString());

    }
}