public class Calculadora {

    private static float PI = 3.14f;

    public static double circuferencia(double raio) {
        raio = 3 / PI;
        return raio;
    }

    public static double volumeEsfera(double raio, double volume) {
        volume = (4 / 3) * PI * Math.pow(raio, 3);
        return volume;
    }

    public static double volumeCilindro(double raio, double altura, double volume) {
        volume = PI * Math.pow(raio, 2) * altura;
        return volume;
    }

}
