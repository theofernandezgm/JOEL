import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A>B){
            System.out.println(A - B);
        }else if (A<B){
            System.out.println(B - A);
        }
        else {
            System.out.println("0");
        }
    }
}