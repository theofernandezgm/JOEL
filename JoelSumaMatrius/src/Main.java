import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int[][] matriu1 = new int[k][k];
        int[][] matriu2 = new int[k][k];
        int[][] resultat = new int[k][k];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matriu1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matriu2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                resultat[i][j] = matriu1[i][j] + matriu2[i][j];
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
