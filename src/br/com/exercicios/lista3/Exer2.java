package br.com.exercicios.lista3;


import java.util.ArrayList;

public class Exer2 {
    private ArrayList<Double> alturas;

    public Exer2() {
        alturas = new ArrayList<Double>();
    }

    public void adicionarAltura(double altura) {
        alturas.add(altura);
    }

    public double encontrarMenorAltura() {
        double menorAltura = alturas.get(0);

        for (int i = 1; i < alturas.size(); i++) {
            if (alturas.get(i) < menorAltura) {
                menorAltura = alturas.get(i);
            }
        }

        return menorAltura;
    }

    public double encontrarMaiorAltura() {
        double maiorAltura = alturas.get(0);

        for (int i = 1; i < alturas.size(); i++) {
            if (alturas.get(i) > maiorAltura) {
                maiorAltura = alturas.get(i);
            }
        }

        return maiorAltura;
    }
}
