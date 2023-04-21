package br.com.exercicios.lista3;

import java.util.Scanner;

public class Exer2Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exer2 exer2 = new Exer2();

        for (int i = 1; i <= 15; i++) {
            System.out.printf("Digite a altura da pessoa %d: ", i);
            double altura = input.nextDouble();
            exer2.adicionarAltura(altura);
        }

        double menorAltura = exer2.encontrarMenorAltura();
        double maiorAltura = exer2.encontrarMaiorAltura();

        System.out.printf("A menor altura do grupo é: %.2f%n", menorAltura);
        System.out.printf("A maior altura do grupo é: %.2f%n", maiorAltura);

        input.close();
    }
}
