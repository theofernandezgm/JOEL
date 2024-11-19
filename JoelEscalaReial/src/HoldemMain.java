import java.util.Scanner;

public class HoldemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            int[] cartes;
            cartes = new int[7];
            for (int j = 0; j < cartes.length; j++){
                cartes[j] = scanner.nextInt();
            }
            boolean esescala = false;
            boolean esreial = false;
            for (int j = 0; j < cartes.length - 1; j++) {
                for (int k = 0; k < cartes.length - 1 - j; k++) {
                    if (cartes[k] > cartes[k + 1]) {
                        int arr = cartes[k];
                        cartes[k] = cartes[k + 1];
                        cartes[k + 1] = arr;
                    }
                }
            }
            if (cartes[3] == 10 && cartes[4] == 11 && cartes[5] == 12 && cartes[6] == 13 && cartes[0] == 1) {
                esreial = true;
            }
            int comptaescala = 1;
            for (int j = 1; j < cartes.length; j++) {
                if (cartes[j] == cartes[j - 1] + 1) {
                    comptaescala++;
                } else if (cartes[j] != cartes[j - 1]) {
                    comptaescala = 1;
                }
                if (comptaescala >= 5) {
                    esescala = true;
                    break;
                }
            }
            if (esreial) {
                System.out.println("ESCALA REIAL");
            } else if (esescala) {
                System.out.println("ESCALA");
            } else {
                System.out.println("NO");
            }
        }
    }
}