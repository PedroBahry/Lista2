import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        int q = 0;

        System.out.println("Digite uma váriavel: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] == n) {
                q++;
            }
        }

        System.out.println("O número " + n + " apareceu " + q + " vezes.");

        scanner.close();

    }
}