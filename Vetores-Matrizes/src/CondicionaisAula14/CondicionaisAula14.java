import java.util.Scanner;

public class CondicionaisAula14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
    }
}
