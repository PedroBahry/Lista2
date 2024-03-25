import java.util.Scanner;

public class Exercicio9 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        double[] A = new double[5];
        double[] B = new double[5];
        double[] C = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número da var A:");
            A[i] = scanner.nextDouble();

            System.out.println("Digite o  " + (i + 1) + "ª número da var B:");
            B[i] = scanner.nextDouble();

         
         
        }


        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            } else { 
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C gerado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
