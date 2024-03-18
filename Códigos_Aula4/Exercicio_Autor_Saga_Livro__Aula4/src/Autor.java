public class Autor {

    private String nome;
    private Saga[] sagas = new Saga[10];

    public void listarSagas() {
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] != null) {
                System.out.println(sagas[i].getNota());
                break;
            }
        }
    }

    public void adicionarSaga(Saga saga) {
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] == null) {
                sagas[i] = saga;
                break;
            }
        }
    }

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Saga[] getSagas() {
        return sagas;
    }

    public void setSagas(Saga[] sagas) {
        this.sagas = sagas;
    }
}
