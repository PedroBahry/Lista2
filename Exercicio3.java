import java.util.Scanner;

public class Exercicio3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double[] dobro = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            dobro[i] = numeros[i] * 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("O dobro de " + numeros[i] + " é " + dobro[i]);
        }

        scanner.close();

    }
}