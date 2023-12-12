import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();


        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        scanner.close();
    }
}
