import java.util.Scanner;

public class Exercicio6 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] nota = new double[5];
        double[] peso = new double[5];
        double somaNotas = 0.0;
        double somaPesos = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            nota[i] = scanner.nextDouble();

            System.out.println("Digite o peso da " + (i + 1) + "ª nota:");
            peso[i] = scanner.nextDouble();

            somaNotas += nota[i] * peso[i];
            somaPesos += peso[i];
        }

        double mediaPonderada = somaNotas / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
