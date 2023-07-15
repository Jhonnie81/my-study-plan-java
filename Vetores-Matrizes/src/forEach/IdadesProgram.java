import java.util.Scanner;

public class IdadesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[5];

        System.out.println("Digite 5 idades:");

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int idade : idades) {
            soma += idade;
        }

        double media = (double) soma / idades.length;
        System.out.println("A média das idades é: " + media);
    }
}
