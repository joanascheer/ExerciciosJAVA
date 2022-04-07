package br.com.catalisa;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner lemenu = new Scanner(System.in);

        Double[] numerosDigitados = new Double[2];

        int opcao = 0;

        recebeNumeros(numerosDigitados);

        do {

            System.out.println("\n");
            System.out.println("************************");
            System.out.println(" CALCULADORA ");
            System.out.println("************************ \n");

            System.out.println("Que operação deseja realizar? \n");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Porcentagem");
            System.out.println("6 - Sair \n");
            System.out.println("Digite uma opção: ");
            opcao = lemenu.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6) {

                System.out.println("Opção inválida");
                System.exit(0);

            } else if (opcao == 1) {

                somaNumeros(numerosDigitados);

            } else if (opcao == 2) {

                subtracaoNumeros(numerosDigitados);

            } else if (opcao ==3) {

                divisaoNumeros(numerosDigitados);

            } else if (opcao == 4) {

                multiplicacaoNumeros(numerosDigitados);

            } else if (opcao == 5) {

                porcentagemNumeros(numerosDigitados);

            } else if (opcao == 6) {
                System.out.println("Até a próxima! ;)");
                System.exit(0);
            }

        } while (true);



    }

    // Recebe números
    public static Double[] recebeNumeros (Double[] numerosDigitados) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        numerosDigitados[0] = leitor.nextDouble();
        System.out.println("Digite o segundo número");
        numerosDigitados[1] = leitor.nextDouble();

        return numerosDigitados;

    }

    // Soma
    public static double somaNumeros (Double[] numerosDigitados) {

        double soma = numerosDigitados[0] + numerosDigitados[1];
        System.out.println(numerosDigitados[0]+ " + " +numerosDigitados[1]+ " = " +soma);

        return soma;

    }

    // Subtração
    public static double subtracaoNumeros (Double[] numerosDigitados) {

        double subtracao = numerosDigitados[0] - numerosDigitados[1];
        System.out.println(numerosDigitados[0]+ " - " +numerosDigitados[1]+ " = " +subtracao);

        return subtracao;
    }

    // Divisão
    public static double divisaoNumeros (Double[] numerosDigitados) {

        double divisao = numerosDigitados[0] / numerosDigitados[1];
        System.out.println(numerosDigitados[0]+ " / " +numerosDigitados[1]+ " = " +divisao);

        return divisao;
    }

    // Multiplicação
    public static double multiplicacaoNumeros (Double[] numerosDigitados) {

        double multiplicacao = numerosDigitados[0] * numerosDigitados[1];
        System.out.println(numerosDigitados[0]+ " x " +numerosDigitados[1]+ " = " +multiplicacao);

        return multiplicacao;
    }

    // Porcentagem
    public static double porcentagemNumeros (Double[] numerosDigitados) {

        double porcentagem = numerosDigitados[0] * numerosDigitados[1] / 100;
        System.out.println(numerosDigitados[0]+ " % de " +numerosDigitados[1]+ " = " +porcentagem);

        return porcentagem;
    }


}
