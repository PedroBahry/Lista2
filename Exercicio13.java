import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int[] fibonacci = new int[tamanho];

        if (tamanho > 0) {
            fibonacci[0] = 1;
        }

        if (tamanho > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < tamanho; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        scanner.close();
    }
}