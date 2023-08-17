package org.example.aula.resolucaoexercicios;

import java.util.Scanner;
//import java.util.stream.Stream;

/*
Desenvolva uma solução para calcular quanto um funcionário deverá receber por suas férias.
Para isso, é preciso multiplicar o valor do seu salário pela quantidade de meses trabalhados.
Em seguida, esse número deve ser dividido por 12. A esse resultado, deve-se somar 1/3 dele mesmo.
*/
public class VacationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Vacation Calculator ===");

        System.out.print("Digite o salário do funcionário: ");
        double salary = input.nextDouble();

        System.out.println("Digite a quantidade de meses trabalhados somente numeros inteiros de meses");
        System.out.print("Digite a quantidade de meses trabalhados: ");
        int monthsWorked = input.nextInt();

        double vacationValue = calculateVacationValue(salary, monthsWorked);

        System.out.printf("===Vacation value %.2f===", vacationValue);

        input.close();
    }

    private static double calculateVacationValue(double salary, int monthsWorked) {
        if (monthsWorked > 12) return salary * monthsWorked / 12 + (salary * monthsWorked / 12) / 3;

        else System.out.println("O funcionário não tem direito a férias");
        return 0;
    }

    /*
    //Ternário JAVA
    return (monthsWorked > 12)
        ? (salary * monthsWorked / 12) + ((salary * monthsWorked / 12) / 3)
        : 0;

    return salary * monthsWorked / 12 + (salary * monthsWorked / 12) / 3;

    return Stream.of(salary * monthsWorked / 12, (salary * monthsWorked / 12) / 3)
            .mapToDouble(Double::doubleValue)
            .sum();

    double valorFerias = (salario * mesesTrabalhados) / 12.0;
        valorFerias += valorFerias / 3.0;
        valorFerias = valorFerias*2 / 3.0;
        return valorFerias;
     */

    /*

        System.out.print("Digite a quantidade de dias trabalhados além dos meses: ");
        int diasTrabalhadosAlemMeses = scanner.nextInt();

        if (mesesTrabalhados > 12 || (mesesTrabalhados == 12 && diasTrabalhadosAlemMeses >= 15)) {
            double valorFerias = calcularValorFerias(salario, mesesTrabalhados, diasTrabalhadosAlemMeses);
            System.out.println("O funcionário tem direito a receber R$" + valorFerias + " de férias.");
        } else {
            System.out.println("O funcionário não tem direito a férias pois possui menos de 12 meses e 15 dias trabalhados.");
        }

        scanner.close();
    }

    public static double calcularValorFerias(double salario, int mesesTrabalhados, int diasTrabalhadosAlemMeses) {
        double valorBase = (salario * mesesTrabalhados) / 12;
        double valorTotal = valorBase + (valorBase / 3);

        if (diasTrabalhadosAlemMeses >= 15) {
            valorTotal += (salario / 30) * diasTrabalhadosAlemMeses;
        }

        return valorTotal;
    }
}
     */
}