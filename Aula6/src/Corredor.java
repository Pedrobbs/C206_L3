public class Corredor extends Atleta implements Equipamento {
    @Override
    public void colocarEquipamento() {
        System.out.println("Corredor colocando roupa para correr...");
    }

    @Override
    public void treinar() {
        System.out.println("Corredor treinando corrida...");
    }
}
