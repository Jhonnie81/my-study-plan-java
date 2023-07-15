import java.util.Scanner;

public class Exercicio13Aula17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base: ");
        int base = scan.nextInt();

        System.out.println("Entre com a potencia");
        int pot = scan.nextInt();

        int resulto = base;

        for (int i = 1; i < pot; i++) {
            resulto *= base;
        }
        System.out.println("Resultado " + resulto);
    }
}
