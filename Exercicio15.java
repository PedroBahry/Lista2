import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];

        System.out.println("Digite o 1ª número de A inteiro:");
        A[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            int num;
            do {
                System.out.println("Digite o " + (i + 1) + "ª número de A inteiro (deve ser maior que o anterior):");
                num = scanner.nextInt();
            } while (num <= A[i - 1]);
            A[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("O " + (i + 1) + "ª número é:" + A[i]);
        }

        scanner.close();
    }
}