import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int F = scanner.nextInt();
        int C = scanner.nextInt();

        int[][] matriu = new int[F][C];
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = scanner.nextInt();
            }
        }

        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matriu[i][j]);
                if (j < C - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(matriu[fila][columna]);
    }
}
