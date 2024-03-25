import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número de A inteiro:");
            A[i] = scanner.nextInt();

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("O " + (5 - i) + "ª o vetor invertido é:" + A[i]);
        }
    }

}
