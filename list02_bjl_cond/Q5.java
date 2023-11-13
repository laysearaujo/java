package list02_bjl_cond;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        int escolha = scanner.nextInt();

        System.out.println("Insira o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int num2 = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }
}
