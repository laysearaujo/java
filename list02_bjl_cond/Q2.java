package list02_bjl_cond;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
