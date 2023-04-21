package br.com.exercicios.lista3;

import java.util.Scanner;

public class Exer3 {

	protected int qtdPositivo, qtdNegativo, qtdTotal;

	public int core() {
		Scanner input = new Scanner(System.in);

		int sentinela = 1;
		int somatorio = 0;
		int recebeValor;

		while (sentinela != 0) {
			System.out.print("Digite um valor: ");
			recebeValor = input.nextInt();
			if (recebeValor == 0)
				break;
		
		somatorio = somatorio + recebeValor;
		if (recebeValor < 0) {
			qtdNegativo = qtdNegativo + 1;
		} else {
			qtdPositivo = qtdPositivo + 1;
		}
		qtdTotal = qtdTotal + 1;
	}
		input.close();
		return somatorio;
		
}


	public void relatorio() {
		System.out.println("Total de entradas : " + qtdTotal);
		System.out.println("Total de positivos : " + qtdPositivo);
		System.out.println("Total de negativos : " + qtdNegativo);
		double percePositivo = ((double) qtdPositivo / (double) qtdTotal * 100.0);
		double perceNegativo = ((double) qtdNegativo / (double) qtdTotal * 100.0);
		System.out.println("O percentual dos numeros POSITIVOS é: " + percePositivo);
		System.out.println("O percentual dos numeros NEGATIVOS é: " + perceNegativo);

	}

}
