import java.util.Scanner;

public class Exercicio1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / 5;

        System.out.println("Média: " + media);
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i] + " é menor que a média.");
            } else if (numeros[i] == media) {
                System.out.println(numeros[i] + " é igual à média.");
            } else {
                System.out.println(numeros[i] + " é maior que a média.");
            }
        }

        scanner.close();

    }
}
