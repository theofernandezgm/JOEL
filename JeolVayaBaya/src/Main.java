import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <  n; i++){
            String linia = scanner.nextLine();
            String resultat = linia.replace('b', 'x') .replace('v', 'b') .replace('x', 'v')
            .replace('B', 'x') .replace('V', 'B') .replace('x', 'V');
            System.out.println(resultat);
        }
    }
}
