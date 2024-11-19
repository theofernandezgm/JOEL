import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            int N = scanner.nextInt();
            int[] alçada = new int[N];
            int mesgran = 100;
            int mespetit = 220;
            for (int j = 0; j < N; j++) {
                alçada[j] = scanner.nextInt();
                if (alçada[j] > mesgran) {
                    mesgran = alçada[j];
                }
                if (alçada[j] < mespetit) {
                    mespetit = alçada[j];
                }
            }
            int diferencia = mesgran - mespetit;
            System.out.println(diferencia);
        }
    }
}