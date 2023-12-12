import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;

        while (true) {
            System.out.println("Insira um número:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de positivos: " + positivos);
        scanner.close();
    }
}
