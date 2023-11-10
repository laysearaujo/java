package list01_bjl_seq;
import java.util.Scanner;
import java.lang.Math;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = Math.pow(num1, num2);

        System.out.println("Resultado: " + resultado);
    }
}
