package org.example.desafios.manipulacaostring;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Crie um número inteiro da entrada padrão e um array de inteiros com tamanho n:
        // TODO: Crie um loop para ler n inteiros da entrada padrão e armazená-los no array:
        // TODO: Classifique o array em ordem crescente e imprima o array classificado:
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Digite uma string: ");
        String s = scanner.nextLine();
        String resultado = vogaisEmCaixaAlta(s);
        System.out.println(resultado);
    }

    public static String vogaisEmCaixaAlta(String s) {
        String vogais = "aeiouAEIOU";
        return s.chars().mapToObj(c -> {
            char character = (char) c;
            return vogais.indexOf(character) != -1 ? Character.toUpperCase(character) : Character.toLowerCase(character);
        }).map(Object::toString).collect(Collectors.joining());

    }
}