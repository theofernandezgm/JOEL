import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i < casos; i++){
            int posicioinicial = scanner.nextInt();
            int tirada1 = scanner.nextInt();
            int tirada2 = scanner.nextInt();
            int tirada3 = scanner.nextInt();
            int posiciofinal = posicioinicial;
            int [] tirades = {tirada1, tirada2, tirada3};
            for (int j = 0; j < tirades.length; j++){
                posiciofinal = posiciofinal + tirades[j];
                if (posiciofinal == 8){
                    break;
                }
                if (posiciofinal > 8){
                    posiciofinal = 8 - (posiciofinal - 8);
                }
            }
            System.out.println(posiciofinal);
        }
    }
}