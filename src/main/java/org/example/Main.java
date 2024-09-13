package org.example;
import java.util.Scanner;

/*
 * ============================================
 *               CALCULADORA BÁSICA
 * ============================================
 * Esta aplicação realiza as quatro operações
 * básicas (soma, subtração, multiplicação,
 * divisão) e módulo.
 *
 * Autor: Carlos
 * Data: 13/09/2024
 * Versão: 1.0.1
 * ============================================
 */


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seja muito bem-vindo!");
    System.out.printf("Digite o primeiro número:\n");
    double firstNumber = scanner.nextDouble();
    System.out.printf("Digite o segundo número:\n");
    double secondNumber = scanner.nextDouble();

    System.out.printf("Para somar (+) digite: 1\n");
    System.out.printf("Para subtrair (-) digite: 2\n");
    System.out.printf("Para multiplicar (x) digite: 3\n");
    System.out.printf("Para dividir (/) digite: 4\n");
    System.out.printf("Para módulo (%%) digite: 5\n");
    int operation = scanner.nextInt();
    double result = 0;
    switch (operation) {
        case 1:
            result = firstNumber + secondNumber;
            System.out.printf("A soma entre %.1f e %.1f resulta em %.2f\n", firstNumber, secondNumber, result);
                break;
        case 2:
            result = firstNumber - secondNumber;
            System.out.printf("A subtração entre %.1f e %.1f resulta em %.2f\n", firstNumber, secondNumber, result);
                break;
        case 3:
            result = firstNumber * secondNumber;
            System.out.printf("A multiplicação entre %.1f e %.1f resulta em %.2f\n", firstNumber, secondNumber, result);
            break;
        case 4:
            if (secondNumber != 0){
                result = firstNumber / secondNumber;
                System.out.printf("A divisão entre %.1f e %.1f resulta em %.2f\n", firstNumber, secondNumber, result);
            } else {
                System.out.println("Erro: Divisão por zero.\n");
                return;
            }
            break;
        case 5:
            result = firstNumber % secondNumber;
            System.out.printf("O resto da divisão entre %.1f e %.1f resulta em %.2f\n", firstNumber, secondNumber, result);
            break;
        default:
            System.out.println("Operação inválida.\n");
            return;

    }

    }
}