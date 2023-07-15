import java.util.Scanner;

public class matrizesExer  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[2][2];

        numeros[0][0] = 10;
        numeros[0][1] = 15;

        numeros[1][0] = 20;
        numeros[1][1] = 25;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){

                if (numeros[i][j] % 2 == 0)
                System.out.println("Numero: " + numeros[i][j] + " é par.");
                else if (numeros[i][j] % 2 != 0)  {
                    System.out.println("Numero: " + numeros[i][j] + " é impar. ");
                }
            }
        }

    }
}