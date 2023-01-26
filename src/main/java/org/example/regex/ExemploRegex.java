package org.example.regex;

public class ExemploRegex {
    public static void main(String[] args) {
    // Regex para validar CPF
    String regex = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}";
    String cpf = "123.456.789-00";
    System.out.println(cpf.matches(regex));
    }
}
