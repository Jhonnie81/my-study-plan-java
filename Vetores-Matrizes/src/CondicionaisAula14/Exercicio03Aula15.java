import java.util.Scanner;

public class Exercicio03Aula15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a letra (F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        }else {
            System.out.println("sexo invalido");
        }
    }
}
