public class Main {
    public static void main(String[] args) {

        Corredor corredor = new Corredor();
        Ciclista ciclista = new Ciclista();
        Nadador nadador = new Nadador();

        corredor.colocarEquipamento();
        corredor.treinar();
        ciclista.colocarEquipamento();
        ciclista.treinar();
        nadador.treinar();
    }
}