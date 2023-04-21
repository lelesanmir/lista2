package br.com.exercicios.lista3;

public class Exer7 {
    private int n;

    public Exer7(int n) {
        this.n = n;
    }

    public void calcularTabuada() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, n, i * n);
        }
    }
}
