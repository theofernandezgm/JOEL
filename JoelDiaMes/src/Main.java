import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dies = scanner.nextInt();
        if (dies > 31 && dies< 60){
            System.out.println((dies/30)+1);
        }else if (dies <365){
            System.out.println(((dies - 1)/30)+1);
        }
    }
}