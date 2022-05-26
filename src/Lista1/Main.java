package Lista1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);


        System.out.println("=========================================");
        System.out.println("===SELECIONE UMA DAS OPÇÕES DE CALCULO===");
        System.out.println("|SOMA| OPÇÃO - 1");
        System.out.println("|SUBTRAÇÃO| OPÇÃO - 2");
        System.out.println("|DIVISÃO| OPÇÃO - 3");
        System.out.println("|MULTIPLICAÇÃO| OPÇÃO - 4");
        System.out.println("Sair do Sistema OPÇÃO - 5");

        int operacaoDesejada = sc.nextInt();


            switch (operacaoDesejada) {
                case 1 -> {
                    System.out.println("Insira os dois números para efetuar a operação");
                    double primeiroNumero = sc.nextDouble();
                    double segundoNumero = sc.nextDouble();
                    calc.somar(primeiroNumero, segundoNumero);
                    break;
                }

                case 2 -> {
                    System.out.println("Insira os dois números para efetuar a operação");
                    double primeiroNumero = sc.nextDouble();
                    double segundoNumero = sc.nextDouble();
                    calc.subtrair(primeiroNumero, segundoNumero);
                    break;
                }

                case 3 -> {
                    System.out.println("Insira os dois números para efetuar a operação");
                    double primeiroNumero = sc.nextDouble();
                    double segundoNumero = sc.nextDouble();
                    calc.dividir(primeiroNumero, segundoNumero);
                    break;
                }

                case 4 -> {
                    System.out.println("Insira os dois números para efetuar a operação");
                    double primeiroNumero = sc.nextDouble();
                    double segundoNumero = sc.nextDouble();
                    calc.multiplicar(primeiroNumero, segundoNumero);
                    break;
                }

            }


    }
}
