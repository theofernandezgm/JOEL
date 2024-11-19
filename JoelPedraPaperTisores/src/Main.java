import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jugador1 = scanner.nextInt();
        int jugador2 = scanner.nextInt();
        if (jugador1 == 1 && jugador2 == 3){
            System.out.println("Jugador1");
        }else if (jugador1 == 2 && jugador2 == 1){
            System.out.println("Jugador1");
        }else if (jugador1 == 3 && jugador2 == 2){
            System.out.println("Jugador1");
        }else if (jugador1 < 1 || jugador1 > 3 ){
            System.out.println("ERROR");
        }
        else if (jugador2 < 1 || jugador2 > 3){
            System.out.println("ERROR");
        }
        else if (jugador1 == jugador2){
            System.out.println("EMPAT");
        }
        else {
            System.out.println("Jugador2");
        }
    }
}