package list01_bjl_seq;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário:");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.25;

        System.out.println("Novo salário: " + novoSalario);
    }
}
