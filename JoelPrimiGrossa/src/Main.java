import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int preunumero = scanner.nextInt();
            int[] peticions = new int[100];
            int nombrepeticions = 0;
            while (true) {
                int peticio = scanner.nextInt();
                if (peticio == 0) {
                    break;
                }
                peticions[nombrepeticions] = peticio;
                nombrepeticions++;
            }
            for (int j = 0; j < nombrepeticions - 1; j++) {
                for (int k = 0; k < nombrepeticions - 1 - j; k++) {
                    if (peticions[k] > peticions[k + 1]) {
                        int temp = peticions[k];
                        peticions[k] = peticions[k + 1];
                        peticions[k + 1] = temp;
                    }
                }
            }
            int acceptades = 0;
            for (int j = 0; j < nombrepeticions; j++) {
                if (preunumero + (peticions[j] * -1) < 0) {
                    break;
                }
                preunumero = preunumero + (peticions[j] * -1);
                acceptades++;
            }
            System.out.println(acceptades);
        }
    }
}