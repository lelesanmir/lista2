package br.com.exercicios.lista3;

import java.util.Scanner;

public class Exer4 {
    private int[] intervalos;

    public Exer4() {
        intervalos = new int[4];
    }

    public void contarNumeros() {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite um número negativo para sair): ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                intervalos[0]++;
            } else if (numero >= 26 && numero <= 50) {
                intervalos[1]++;
            } else if (numero >= 51 && numero <= 75) {
                intervalos[2]++;
            } else if (numero >= 76 && numero <= 100) {
                intervalos[3]++;
            }

        } while (numero >= 0);

        input.close();
    }

    public void exibirResultados() {
        System.out.printf("Intervalo [0-25]: %d%n", intervalos[0]);
        System.out.printf("Intervalo [26-50]: %d%n", intervalos[1]);
        System.out.printf("Intervalo [51-75]: %d%n", intervalos[2]);
        System.out.printf("Intervalo [76-100]: %d%n", intervalos[3]);
    }
}
