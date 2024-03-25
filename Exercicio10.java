import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] A = new double[5];
        double[] B = new double[A.length];
    

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número da var A:");
            A[i] = scanner.nextDouble();

         
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }


        System.out.println("O valor invertido é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }
}
