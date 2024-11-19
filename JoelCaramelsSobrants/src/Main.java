import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int caramels = scanner.nextInt();
        int nens = scanner.nextInt();
        int caramelpernens = caramels / nens;
        System.out.println((caramels - (caramelpernens * nens)));
    }
}