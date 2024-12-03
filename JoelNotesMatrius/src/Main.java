import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            int alumnes = scanner.nextInt();
            int moduls = scanner.nextInt();
            int[][]matriu = new int[alumnes][moduls];
            for (int j = 0; j < alumnes; j++){
                for (int l = 0; l < moduls; l++){
                    matriu[j][l] = scanner.nextInt();
                }
            }
            for (int j = 0; j < alumnes; j++){
                int suma = 0;
                for (int l = 0; l < moduls; l++){
                    suma += matriu[j][l];
                }
                int mitjana = suma / moduls;
                System.out.println(mitjana + " ");
            }
        }
    }
}