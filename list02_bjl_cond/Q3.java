package list02_bjl_cond;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}
