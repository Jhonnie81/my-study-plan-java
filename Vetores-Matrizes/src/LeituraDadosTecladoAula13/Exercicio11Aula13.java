import java.util.Scanner;

public class Exercicio11Aula13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro: ");
        int numero1 = scan.nextInt();
        System.out.println("Entre com outro numero inteiro: ");
        int numero2 = scan.nextInt();
        System.out.println("Entre com numero real: ");
        double numero3 = scan.nextDouble();

        int resultado1 = (numero1 * 2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);


    }
}
