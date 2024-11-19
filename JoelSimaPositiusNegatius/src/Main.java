import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positius = 0;
        int negatius = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                positius++;
            } else {
                negatius++;
            }
        }
        if (positius > negatius) {
            System.out.println("POSITIUS");
        } else if (negatius > positius) {
            System.out.println("NEGATIUS");
        } else {
            System.out.println("IGUALS");
        }

        scanner.close();
    }
}