import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deus = 0;
        int notestotals = 0;
        int nota = 0;
        while (nota!=-1){
            nota = scanner.nextInt();
            if (nota <= 10 && nota >= 0){
                notestotals++;
            }
            if (nota == 10){
                deus++;
            }
        }
        System.out.println("TOTAL NOTES: " + notestotals + " NOTES10: " + deus);
    }
}