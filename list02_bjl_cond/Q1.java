package list02_bjl_cond;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else if (num1 < num2) {
            System.out.println("O maior é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
