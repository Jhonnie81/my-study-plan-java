import java.util.Scanner;

public class Exercicio04Aula17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de Anos: " + cont);
    }*/

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;
        do {
            System.out.println("Entre com a população A: ");
            popA = scan.nextDouble();
            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("Populaçao A precisa ser maior que 0.");
            }
        } while (!valido);

             valido = false;
        do {
            System.out.println("Entre com a população B: ");
            popB = scan.nextDouble();
            if (popB > 0) {
                valido = true;
            } else {
            System.out.println("População B precisa ser maior que 0. ");
            }
        } while (!valido);

            valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();
            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa A precisa ser maior que 0. ");
            }
        } while (!valido);
        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa B precisa ser maior que 0. ");
            }
        } while (!valido);
        int cont = 0;
        while (popA < popB) {
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd Anos: " + cont);
    }
}
