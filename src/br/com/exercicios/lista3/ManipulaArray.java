package br.com.exercicios.lista3;

import java.util.Scanner;

public class ManipulaArray {

	protected int idade[];
	protected String nome[];

	public ManipulaArray(int tamanho) {
		idade = new int[tamanho];
		nome = new String[tamanho];
	}// fim construtor

	public void core() {
		Scanner input = new Scanner(System.in);
		String n;
		int i;
		for (int contador = 0; contador < idade.length; contador++) {
			System.out.print("Insira o nome:");
			n = input.next();
			nome[contador] = n;
			System.out.print("Insira a idade:");
			i = input.nextInt();
			idade[contador] = i;
		} // fim for

		for (int contador = 0; contador < idade.length; contador++) {
			System.out.println("Nome:" + nome[contador] + " possui:" + idade[contador]);
		} // fim for

		System.out.println("***********Finalizei a impressao total ************");
		input.close();
	}// fim metodo core

	public void maiorIdade(int idadeBase) {

		int maisVivido = -1;
		String nomeVivido = "";
		for (int contador = 0; contador < idade.length; contador++) {
			if (idade[contador] >= idadeBase) {
				System.out.println(nome[contador] + " é de maior e possui:" + idade[contador]);

				if (idade[contador] > maisVivido) {
					maisVivido = idade[contador];
					nomeVivido = nome[contador];
				}
			}
		} // fim for

		System.out.println("O mais vivido é:" + nomeVivido + " e possui idade:" + maisVivido);

	}

}
