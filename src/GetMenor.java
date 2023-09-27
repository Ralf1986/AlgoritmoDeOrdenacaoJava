public class GetMenor {

    public static int getMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {  //// i=1 porque não precisa comparar com o primeiro elemento
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }


}
