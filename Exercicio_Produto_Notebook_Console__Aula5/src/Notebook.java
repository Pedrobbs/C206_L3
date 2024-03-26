public class Notebook extends Produto{
    private String processador;
    private String memoria;

    public void instalarAplicativo() {
        System.out.println("Instalando Aplicativo...");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Processador: " + processador);
        System.out.println("Memoria: " + memoria);
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
