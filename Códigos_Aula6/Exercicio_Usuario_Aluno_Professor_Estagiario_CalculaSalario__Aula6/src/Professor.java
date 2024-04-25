public class Professor extends Usuario implements CalculaSalario {

    private int numDeAulas;
    private int horas;

    public Professor(int id, int senha, int numDeAulas, int horas) {
        super(id, senha);
        this.numDeAulas = numDeAulas;
        this.horas = horas;
    }

    @Override
    public float calcularSalario() {
        float salario = 0;
        salario = horas * 12.27f;
        return salario;
    }

   public void mostraInfo(){
       System.out.println("NumDeAula: " + numDeAulas + " aulas.");
       System.out.println("Horas_Trabalhadas: " + horas + " horas.");
    }
}
