import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++){
            int N = scanner.nextInt();
            int [] numeros = new int[N];
            for (int j = 0; j < N; j++){
                numeros [j] = scanner.nextInt();
            }
            for (int j = 0; j < numeros.length - 1; j++) {
                for (int k = 0; k < numeros.length - 1 - j; k++) {
                    if (numeros[k] > numeros[k + 1]) {
                        int temp = numeros[k];
                        numeros[k] = numeros[k + 1];
                        numeros[k + 1] = temp;
                    }
                }
            }
            int[] suma = new int [N / 2];
            for (int j = 0; j < N / 2; j++) {
                suma [j] = numeros [j] + numeros [N - 1 - j];
            }

            for (int j = 0; j < N / 2; j++) {
                System.out.print(suma [j] + " ");
            }
            System.out.println();
        }
    }
}