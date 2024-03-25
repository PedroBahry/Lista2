import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] A = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número de A inteiro:");
            A[i] = scanner.nextDouble();

        }

        double produto = 1;

        for (int i = 0; i < 12; i++) {
            if (A[i] % 2 == 0 && A[i] > 0) {
                produto *= A[i];
            }
        }

        System.out.println("O produto dos números pares e positivos é: " + produto);

    }

}
