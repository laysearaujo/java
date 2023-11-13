package list02_bjl_cond;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Multiplicação: " + (num1 * num2));
        } else if (num1 > num2) {
            System.out.println("Subtração: " + (num1 - num2));
        } else {
            System.out.println("Soma: " + (num1 + num2));
        }
    }
}
