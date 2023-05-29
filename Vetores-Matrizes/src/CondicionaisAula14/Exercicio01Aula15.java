import java.util.Scanner;

public class Exercicio01Aula15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();


        if (num >= 0){
            System.out.println("O numero " + num + " é positivo. " );
        } else {
            System.out.println("O numero " + num + " é negativo.");
        }
    }
}
