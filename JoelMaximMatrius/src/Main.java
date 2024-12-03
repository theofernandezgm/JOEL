import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        for (int i = 0; i < k; i++){
            int f = scanner.nextInt();
            int c = scanner.nextInt();

            int[][] matriu = new int[f][c];

            for (int j = 0; j < f; j++){
                for (int l = 0; l < c; l++){
                    matriu[j][l] = scanner.nextInt();
                }
            }
            int valormaxim = matriu[0][0];
            int maximf = 1;
            int maximc = 1;

            for (int j = 0; j < f; j++){
                for (int l = 0; l < c; l++){
                    if (matriu[j][l] > valormaxim){
                        valormaxim = matriu[j][l];
                        maximf = j + 1;
                        maximc = l + 1;
                    }
                }
            }
            System.out.println(maximf + "" + maximc);
        }
    }
}