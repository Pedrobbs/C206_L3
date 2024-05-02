class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private int id;
    private static int idGeralCount = 1;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.id = idGeralCount++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Piloto " + nome + " (" + idade + ", " + nacionalidade + ") - ID: " + id;
    }
}