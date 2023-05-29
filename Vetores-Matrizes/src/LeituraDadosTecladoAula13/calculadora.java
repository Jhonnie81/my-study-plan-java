import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scan.nextInt();

        double resultado = numero1 / numero2;

        System.out.println("O resultado é " + resultado);
    }
}
