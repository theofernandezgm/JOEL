import java.util.Scanner;

public class MatriuSuma {
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

        int k = scanner.nextInt();
        int sumafila = 0;

        for (int j = 0; j < C; j++) {
            sumafila += matriu[k][j];
        }

        int sumacolumna = 0;

        for (int i = 0; i < F; i++) {
            sumacolumna += matriu[i][k];
        }

        System.out.println(sumafila + " " + sumacolumna);
    }
}
