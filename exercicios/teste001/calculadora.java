import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int media;
        int soma;

        System.out.println("Entre com um numero:");
        int num = scan.nextInt();
        System.out.println("Entre com um numero:");
        int num2 = scan.nextInt();
        System.out.println("Entre com um numero:");
        int num3 = scan.nextInt();

        soma = num + num2 + num3;
        media = soma / 3;

        System.out.println("Media é: " + media);
    }
}
