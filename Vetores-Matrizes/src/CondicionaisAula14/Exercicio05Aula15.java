import java.util.Scanner;

public class Exercicio05Aula15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        if ((media >= 7) && (media <= 9.99)) {
            System.out.println("Sua média é: " + media + " está aprovado.");
        } else if (media == 10) {
            System.out.println("Sua média é: " + media + " está aprovado com Distinção.");
        } else {
            System.out.println("Sua media é: " + media + " reprovado");
        }


    }
}
