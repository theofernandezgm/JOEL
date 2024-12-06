import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < k; i++){

            String linia = scanner.nextLine();
            linia = linia.replace(" i ", ", ");

            String[] nom = linia.split(", ");

            String primeralletra = "";
            for (int j = 0; j < nom.length; j++){
                primeralletra += nom[j].toUpperCase().charAt(0);
            }
            System.out.println(primeralletra);
        }
    }
}
