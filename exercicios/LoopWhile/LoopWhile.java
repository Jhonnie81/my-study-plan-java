import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Entre com o ultimo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Contando até: " + num2);

        while (num1 <= num2) {
            System.out.println(+ num1);
            num1++;
        }
        System.out.println(num1);
        do {
            num1++;
            System.out.println(+num1);
       }while (num1 < 20);
        System.out.println(num1);
        System.out.println("Contando até " + num2);
       /* while (i <= max) {
            System.out.println("Valor de i " + i);
            i++;// i = i + 1; ou i += 1;
        }
        System.out.println(i);//valor de 11

        do {
            i++;
            System.out.println("Valor de i:" + i);
        } while (i < 15);

        System.out.println(i);*/
    }
}
