import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0 && N % 3 == 0 && N % 4 == 0 && N % 5 == 0 && N % 6 == 0 && N % 7 == 0 && N % 8 == 0 && N % 9 == 0
                && N % 10 == 0){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}