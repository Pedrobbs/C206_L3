public class Main {
    public static void main(String[] args) {
        Banda bandas = new Banda("Turma do Barulho", 4);

        Musica musica1 = new Musica("Trilogia Espontanea", "Album 1");
        Musica musica2 = new Musica("Viver é tudo", "Album 2");

        bandas.adicionarMusica(musica1);
        bandas.adicionarMusica(musica2);

        bandas.tocarMusica(0);
        bandas.tocarShow();
        bandas.deletarMusica("Trilogia Espontanea");
        bandas.tocarMusica(0);
    }
}