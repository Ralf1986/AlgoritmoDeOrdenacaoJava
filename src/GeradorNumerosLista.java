import java.util.Random;

public class GeradorNumerosLista {

    public static int[] listRandom(int tamanho, int maximo) {
        int[] numeros = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextInt(maximo) + 1;
        }
        return numeros;
    }

}
