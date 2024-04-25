public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento() {
        System.out.println("Ciclista colocando roupa para pedalar...");
    }

    @Override
    public void treinar() {
        System.out.println("Ciclista treinando pedal...");
    }
}
