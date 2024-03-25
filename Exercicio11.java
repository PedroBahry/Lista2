import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número de A inteiro:");
            A[i] = scanner.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número de B inteiro:");
            B[i] = scanner.nextInt();

        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            int C = A[i] * B[i];
            System.out.println("O produto escalar dos vetores A e B é: " + C);
            soma += C;
            System.out.println("A soma dos produtos escalares é: " + soma);

        }
    }

}
