package br.com.exercicios.lista3;
import java.util.Scanner;

public class Exer8Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exer8 exer8 = new Exer8();
        
        System.out.print("Digite um número para calcular o seu fatorial: ");
        int num = input.nextInt();
        int fatorial = exer8.calcularFatorial(num);
        
        System.out.print(num + "! = ");
        for (int i = num; i > 1; i--) {
            System.out.print(i + " * ");
        }
        System.out.println("1 = " + fatorial);
        input.close();
    }
    
    
}
