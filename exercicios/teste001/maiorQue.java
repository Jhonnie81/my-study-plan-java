import java.util.Scanner;

public class maiorQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        int maiornumero = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Entre com um numero: ");
            int num = scan.nextInt();
            scan.nextLine();

            if (num % 2 == 0){
               maiornumero++;
            }
        }
        System.out.println("A quantidade de numeros pares são: " + maiornumero);

    }
}
