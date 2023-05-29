import java.util.Scanner;

public class exemploAula12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua Idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Suas Informações são: ");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);

    }
}
