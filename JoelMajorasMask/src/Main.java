import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        if (nombre > 86400) {
            int dia = nombre / 86400;
            if (nombre/86400 < 43200) {
                System.out.println("mati del dia " + (dia + 1));
            } else {
                System.out.println("nit del dia " + (dia + 1));
            }
        } else {
            if (nombre < 43200) {
                System.out.println("mati del dia " + 1);
            } else {
                System.out.println("nit del dia " + 1);
            }
        }
    }
}