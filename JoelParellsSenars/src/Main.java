import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int N = scanner.nextInt();
            int sumparells = 0;
            int sumsenars = 0;
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 0) {
                    sumparells = sumparells + j;
                } else {
                    sumsenars = sumsenars + j;
                }
            }
            System.out.println("PARELLS: " + sumparells + " SENARS: " + sumsenars);
        }

        scanner.close();
    }
}