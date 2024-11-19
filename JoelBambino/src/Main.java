import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();
        if (N == A || N == B || N == C){
            System.out.println("NO");
        }else {
            System.out.println("SI");
        }
    }
}