import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votsJiden = scanner.nextInt();
        int votsDrump = scanner.nextInt();
        if (votsJiden < votsDrump){
            System.out.println("Drump");
        } else if (votsJiden > votsDrump){
            System.out.println("Jiden");
        }else if (votsJiden == votsDrump){
            System.out.println("No");
        }

    }
}