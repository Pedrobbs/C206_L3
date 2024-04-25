public class Estagiario extends Usuario implements CalculaSalario {
    private int numDeHorasTrabalhadas;

    public Estagiario(int id, int senha, int numDeHorasTrabalhadas) {
        super(id, senha);
        this.numDeHorasTrabalhadas = numDeHorasTrabalhadas;
    }

    @Override
    public float calcularSalario() {
        float salario = 0;
        salario = numDeHorasTrabalhadas * 11.20f;
        return salario;
    }

    public void mostraInfo() {
        System.out.println("NumDeHorasTrabalhadas: " + numDeHorasTrabalhadas + " horas.");

    }
}
