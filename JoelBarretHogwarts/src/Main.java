import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (resposta.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (resposta.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}