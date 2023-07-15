import java.util.Scanner;

public class maiorSal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] salarios = new double[5];

        System.out.println("Digite o salário: ");

        for (int i = 0; i < salarios.length; i++){
            System.out.println("Salario " + i + ": ");
            salarios[i] = scan.nextDouble();
        }
        //double maior = 0;
        int indiceMaior = 0;
        for (int i = 1; i < salarios.length; i++){

            if (salarios[i] > salarios[indiceMaior]){
                indiceMaior = i;
            }
        }


        System.out.println("O indice com o maior salario é: " + indiceMaior);
    }
}
