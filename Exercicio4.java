import java.util.Scanner;

public class Exercicio4 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        System.out.println("Digite uma váriavel: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] > n) {
                System.out.println(numeros[i] + " é maior que " + n);
            } else if (numeros[i] == n) {
                System.out.println(numeros[i] + " é igual à " + n);
            } else {
                System.out.println(numeros[i] + " é menor que " + n);
            }
        }

        scanner.close();

    }
}