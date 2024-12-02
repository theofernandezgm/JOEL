import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < casos; i++){
            int k = scanner.nextInt();
            scanner.nextLine();
            String[]animals = new String[k - 1];
            for (int j = 0; j < k - 1; j++){
                animals[j] = scanner.nextLine();
            }
            String buscaranimal = scanner.nextLine();
            boolean trobat = false;
            for (String animal : animals) {
                if (animal.equals(buscaranimal)) {
                    trobat = true;
                    break;
                }
            }
            if (trobat == true){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}