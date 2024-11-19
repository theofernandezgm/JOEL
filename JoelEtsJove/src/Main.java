import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edat = scanner.nextInt();
        if (edat < 32){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}