import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C1 = scanner.nextInt();
        int C2 = scanner.nextInt();
        int C3 = scanner.nextInt();
        if (C1 == C2 && C1 == C3){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}