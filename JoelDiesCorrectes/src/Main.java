import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero < 366 && numero >= 1){
            System.out.println("Correcte per un any no bixest!");
        }else if (numero == 366){
            System.out.println("Correcte per un any bixest!");
        }else {
            System.out.println("Incorrecte!");
        }
    }
}