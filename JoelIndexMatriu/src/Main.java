import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int F = scanner.nextInt();
        int C = scanner.nextInt();

        int [][] matriu = new int[F][C];

        for (int i = 0; i < F; i++){
            for (int j = 0; j < C; j++){
                matriu[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        boolean trobat = false;

        for (int i = 0; i < F; i++){
            for (int j = 0; j < C; j++){
                if (matriu[i][j] == k){
                    System.out.println((i + 1) + " " + (j + 1));
                    trobat = true;
                    break;
                }
            }
            if (trobat) {
                break;
            }
        }

        if (!trobat) {
            System.out.println("-1 -1");
        }
    }
}
