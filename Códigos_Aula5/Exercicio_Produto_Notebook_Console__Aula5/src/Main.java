public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Notebook notebook = new Notebook();
        Console console = new Console();

        System.out.println("Info Console: ");
        console.setNome("Xbox One");
        console.setValor(21);
        console.setGeracao("Segunda Geração");
        console.setMarca("Gucci");
        console.mostraInfo();

       // ((Console) console).getGeracao();   CASTING

        System.out.println();

        System.out.println("Info Notebook: ");
        notebook.setNome("Acer");
        notebook.setValor(10);
        notebook.setProcessador("Core I9");
        notebook.setMemoria("64Gb");
        notebook.mostraInfo();

        System.out.println();

        System.out.println("Info Produtos: ");
        produto.setNome("PC Gamer");
        produto.setValor(2500);
        produto.mostraInfo();

    }
}