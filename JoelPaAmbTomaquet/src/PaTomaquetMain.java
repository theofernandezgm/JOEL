import java.util.Scanner;

public class PaTomaquetMain {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String primeraparaula = scanner.nextLine();
        String segonaparaula = scanner.nextLine();
        System.out.println(primeraparaula + " amb " + segonaparaula);
    }
}