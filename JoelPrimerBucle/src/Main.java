import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++){
            int numero = scanner.nextInt();
            System.out.println(numero + 1);
        }
    }
}