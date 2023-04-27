package org.example.desafios.ordenacaoarray;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Crie um número inteiro da entrada padrão e um array de inteiros com tamanho n:
        // TODO: Crie um loop para ler n inteiros da entrada padrão e armazená-los no array:
        // TODO: Classifique o array em ordem crescente e imprima o array classificado:

        System.out.print("Informe a quantidade de números no array: ");
        int n = sc.nextInt();

        System.out.println("Informe os números do array:");

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] sortedArray = Arrays.stream(array)
                .boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
