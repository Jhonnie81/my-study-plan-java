import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        double media = 0;
        for (int i = 0; i < 4; i++){
            System.out.println("Entre com sua idade: ");
            int num = scan.nextInt();

            soma += num;
            media = soma/4;


            }
        System.out.println("A soma é: "+ soma + " E a media é: "+ media);
        }
    }

