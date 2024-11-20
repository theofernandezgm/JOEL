import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int datanaixement = scanner.nextInt();
        if (datanaixement >= 1945 && datanaixement <= 1965 ){
            System.out.println("ok boomer");
        }else {
            System.out.println("nah");
        }
    }
}