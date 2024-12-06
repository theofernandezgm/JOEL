import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < k; i++){
            String paraulaendevinar = scanner.nextLine();
            String[] intents = scanner.nextLine().split(" ");
            char[] descobert = new char[paraulaendevinar.length()];
            for (int j = 0; j < descobert.length; j++){
                descobert[j] = '*';
            }
            int errors = 0;

            for (int j = 0; j < intents.length; j++){
                char lletra = intents[j].charAt(0);
                boolean esalaparaula = false;
                for (int l = 0; l < paraulaendevinar.length(); l++) {
                    if (paraulaendevinar.charAt(l) == lletra) {
                        descobert[l] = lletra;
                        esalaparaula = true;
                    }
                }
                if (!esalaparaula){
                    errors++;
                }
            }
            String paraulafinal = new String(descobert);
            System.out.println(paraulafinal + " " + errors);
        }
    }
}
