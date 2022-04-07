package br.com.catalisa;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Double[] numeros = new Double[2];

        pegaNumeros(numeros);
        compara(numeros);

    }

    public static Double[] pegaNumeros (Double [] numeros) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        numeros[0] = leitor.nextDouble();

        System.out.println("Digite o segundo valor: ");
        numeros[1] = leitor.nextDouble();

        return numeros;

    }

    public static void compara (Double[] numeros) {

        if (numeros[0] == numeros[1]) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }

    }
}
