import java.util.Scanner;

public class Exercicio14Aula13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArq = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double velInt = scan.nextDouble();

        double tempo = tamArq / velInt;

        System.out.println("Tempo de download: " + tempo);

    }
}
