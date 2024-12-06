import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < k; i++){
            String nom = scanner.nextLine();
            if (nom.equalsIgnoreCase("patata")){
                System.out.println("Es Patata");
            }else {
                System.out.println("No es Patata");
            }
        }
    }
}
