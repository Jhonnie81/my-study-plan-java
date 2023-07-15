import java.util.Scanner;

public class Exercicio01Aula17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.println("Entre com uma nota de 0 a 10: ");
        double nota = scan.nextDouble();

        if (nota >= 0 && nota <=10){
            notaValida = true;
            System.out.println("voce digitou: " + nota);
        } else {
            //notaValida = false;
            System.out.println("Nota inválida, digite novamente.");

        }
        } while (!notaValida);
    }
}
