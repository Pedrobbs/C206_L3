public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Renno");
        Saga s1 = new Saga(10);
        Livro l1 = new Livro("Ação", 260);

        autor.adicionarSaga(s1);
        autor.listarSagas();

        s1.adicionarLivro(l1);
        s1.listaLivros();

    }
}