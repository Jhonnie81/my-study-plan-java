import java.util.Scanner;

public class maiorIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Entre com uma idade: ");
            int num = scan.nextInt();

            if (num >= 18){
                contador++;
            }
            }
        System.out.println(contador + "Pessoas são maiores de idade.");
        }

    }
