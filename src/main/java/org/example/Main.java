package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

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
                break;
        case 2:
            result = firstNumber - secondNumber;
                break;
        case 3:
            result = firstNumber * secondNumber;
            break;
        case 4:
            if (secondNumber != 0){
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Erro: Divisão por zero.");
                return;
            }
            break;
        case 5:
            result = firstNumber % secondNumber;
            break;
    }
        System.out.println(result);
    }
}