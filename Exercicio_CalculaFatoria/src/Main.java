public class Main {
    public static void main(String[] args) {
        System.out.println("Fatoria: " +fatorial(5));
        mostraPares(23);
    }

    public static int fatorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    public static void mostraPares(int n) {
        System.out.print("Valores Pares: ");
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}