import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centims = scanner.nextInt();
        int monedes;
        int[] euros = new int[]{200,100,50,20,10,5,2,1};
        for(int i = 0; i < 8; i++){
            monedes = centims/euros[i];
            centims = centims - monedes*euros[i];
            System.out.println(monedes);
        }
    }
}