package br.com.exercicios.lista3;

class Exer8 {
    public int calcularFatorial(int num) {
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}