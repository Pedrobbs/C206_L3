public class Robo {
    private int energia;
    private String nome;
    static int totalDeRobos;
    private int energiaMaxima;

    public void trabalhar() {
        int nova_energia = 20;
        this.energia -= nova_energia;
    }

    public void trocarEnergia(Robo roboAlvo) {
        Robo robo = new Robo(100, "Robo Pedro", 10, 100);
        if (robo.energia >= 0 && robo.energia <= 100) {
            System.out.println("Passando energia de " + robo.nome + " para um novo robo");
            robo.energia -= roboAlvo.energia;
        }
    }

    public void recarregar(int horas) {
        int recarrega_energia = 20;
        if (energiaMaxima < horas) {
            this.energia += recarrega_energia;
            System.out.println("Bateria carregada em mais " + recarrega_energia + "%");
        } else {
            System.out.println("Não pe possivel recarregar a energia!");
        }
    }

    public Robo(int energia, String nome, int totalDeRobos, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.totalDeRobos = totalDeRobos;
        this.energiaMaxima = energiaMaxima;
    }
}
