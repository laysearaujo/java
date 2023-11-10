package list01_bjl_seq;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe três notas, em sequência:");

            double nota1 = obterNota(scanner, 1);
            double nota2 = obterNota(scanner, 2);
            double nota3 = obterNota(scanner, 3);

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Média aritmética: " + media);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double obterNota(Scanner scanner, int numeroNota) {
        double nota;
        do {
            System.out.print("Nota " + numeroNota + ": ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Por favor, insira uma nota válida entre 0 e 10.");
            }

        } while (nota < 0 || nota > 10);

        return nota;
    }
}
