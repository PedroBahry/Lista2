import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        // Leitura dos números
        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextDouble();
        }

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("O " + (j + 1) + "º número digitado foi: " + numeros[j]);

            if (numeros[j] < 0) {
                System.out.println("Número negativo" + "\n");
            } else if (numeros[j] == 0) {
                System.out.println("Número neutro" + "\n");
            } else {
                System.out.println("Número positivo" + "\n");

            }
        }

        scanner.close();
    }
}
