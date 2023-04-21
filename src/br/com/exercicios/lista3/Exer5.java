package br.com.exercicios.lista3;

import java.util.Scanner;

public class Exer5 {
    private int pares;
    private int impares;
    private int somaPares;
    private int totalNumeros;

    public Exer5() {
        pares = 0;
        impares = 0;
        somaPares = 0;
        totalNumeros = 0;
    }

    public void lerNumeros() {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite 0 para sair): ");
            numero = input.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                pares++;
                somaPares += numero;
            } else if (numero != 0) {
                impares++;
            }

            totalNumeros++;

        } while (numero != 0);

        input.close();
    }

    public void exibirResultados() {
        System.out.printf("Quantidade de números pares: %d%n", pares);
        System.out.printf("Quantidade de números ímpares: %d%n", impares);
        if (pares != 0) {
            double mediaPares = (double) somaPares / pares;
            System.out.printf("Média dos números pares: %.2f%n", mediaPares);
        } else {
            System.out.println("Não houve números pares para calcular a média.");
        }
        double mediaGeral = (double) somaPares / totalNumeros;
        System.out.printf("Média geral dos números lidos: %.2f%n", mediaGeral);
    }
}

