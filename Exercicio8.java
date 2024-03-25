import java.util.Scanner;

public class Exercicio8 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        String[] A = new String[5];
        String[] B = new String[5];
        String[] C = new String[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número da var A:");
            A[i] = scanner.next();

            System.out.println("Digite o  " + (i + 1) + "ª número da var B nota:");
            B[i] = scanner.next();

             C[i] = A[i] + B[i];
        }


        System.out.print("O valor concatenado das variaveis A e B em C são:");
        for (int i=0; i < 5; i++){
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
