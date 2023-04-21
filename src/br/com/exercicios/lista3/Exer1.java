package br.com.exercicios.lista3;

public class Exer1 {

	private int soma;

    public void SomaImparesMultiplosTres() {
        this.soma = 0;
    }

    public int calcularSoma() {
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 1 && i % 3 == 0) {
                this.soma += i;
            }
        }
        return this.soma;
    }
}