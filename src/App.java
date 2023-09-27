public class App {
    public static void main(String[] args) {

        int tamanho = 10;
        int maximo = 100;
        int[] numeros = GeradorNumerosLista.listRandom(tamanho, maximo);


        GeradorNumerosLista.listRandom(10, 100);
        Imprimir.imprimir("Numeros desordenados: \n", tamanho, numeros);
        BubbleSort.bubbleSort(numeros);
        System.out.println("Menor numero da lista: " + GetMenor.getMenor(numeros));
        Imprimir.imprimir("Numeros ordenados: \n", tamanho, numeros);

    }


}
