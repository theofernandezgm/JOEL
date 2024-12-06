import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < k; i++) {
            int tamanyfila = scanner.nextInt();
            ArrayList<Integer> nombres = new ArrayList<>();
            for (int j = 0; j < tamanyfila; j++) {
                nombres.add(scanner.nextInt());
            }

            char direction = scanner.next().charAt(0);

            if (direction == 'L') {
                for (int j = 0; j < nombres.size() - 1; j++) {
                    if (nombres.get(j) == 0) {
                        nombres.remove(j);
                        nombres.add(0);
                        j--;
                    } else if (nombres.get(j).equals(nombres.get(j + 1))) {
                        nombres.set(j, nombres.get(j) * 2);
                        nombres.remove(j + 1);
                        nombres.add(0);
                    }
                }
            } else if (direction == 'R') {
                for (int j = nombres.size() - 1; j > 0; j--) {
                    if (nombres.get(j) == 0) {
                        nombres.remove(j);
                        nombres.add(0, 0);
                    } else if (nombres.get(j).equals(nombres.get(j - 1))) {
                        nombres.set(j, nombres.get(j) * 2);
                        nombres.remove(j - 1);
                        nombres.add(0, 0);
                    }
                }
            }
            for (int j = 0; j < nombres.size(); j++) {
                System.out.print(nombres.get(j) + " ");
            }
        }
    }
}
