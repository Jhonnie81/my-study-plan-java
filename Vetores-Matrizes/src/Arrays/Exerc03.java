import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scan.next();

        System.out.println("Entre com um numero:");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++ ){
            System.out.println(nome);
        }
    }
}
