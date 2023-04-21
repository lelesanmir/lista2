package br.com.exercicios.lista3;

import java.util.Scanner;
public class Exer7Teste {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um valor para N (de 1 a 10): ");
	        int n = sc.nextInt();
	        while (n < 1 || n > 10) {
	            System.out.print("Valor inválido! Digite um valor para N (de 1 a 10): ");
	            n = sc.nextInt();
	        }
	        Exer7 exer7 = new Exer7(n);
	        exer7.calcularTabuada();
	        sc.close();
	    }
	}



