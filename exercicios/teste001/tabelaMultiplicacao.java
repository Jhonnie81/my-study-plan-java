import java.util.Scanner;

public class tabelaMultiplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = num * i;

            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
