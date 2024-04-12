public class Camera {

    private int qualidade;

    public int acharPecas() {
        return (int)((Math.random()*9)+1); // número inteiro aleatório
    }

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }
}
