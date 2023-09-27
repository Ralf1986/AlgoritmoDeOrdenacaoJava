public class Imprimir {

    public static void imprimir(String x, int tamanho, int[] numeros) {
        System.out.println(x);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Numero[" + i + "] = " + numeros[i]);
        }
    }
}
