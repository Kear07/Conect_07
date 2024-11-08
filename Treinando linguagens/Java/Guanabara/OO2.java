
import java.util.Scanner;

public class OO2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = input.next();

        System.out.printf("Olá %s, é um prazer te conhecer!", nome);
    }
}
