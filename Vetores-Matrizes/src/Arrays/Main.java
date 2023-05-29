import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] num;
       /* num = new int[3];

        System.out.println(num[2]);*/
       /* System.out.println("Entre com um numero: ");
        int num = scan.nextInt();*/
        System.out.print("Entre com o tamanho de arrays: ");
        num = new int[scan.nextInt()];

        for (int i = 0; i < num.length; i++) {

            System.out.print("Declare o valor da variavel : ");
            num[i] = scan.nextInt();

        }
        /*System.out.println("Declare o valor da variavel : ");
        num[1] = scan.nextInt();

        System.out.println("Declare o valor da variavel : ");
        num[2] = scan.nextInt();*/
        for (int i = 0; i < num.length; i++) {
            System.out.println("O valor de cada variavel é: " + num[i]);
        }


        for (int i = 0; i < num.length; i++) {
            //   System.out.println("O valor da terceira variavel é: " + num[2]);break;
            if (i == 2) {
                System.out.println("O valor da terceira variavel é: " + num[i]);
            }

        }
    }
    }