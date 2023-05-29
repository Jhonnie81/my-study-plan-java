import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primerioNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primerioNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdfilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdfilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Animal de estimação: " + temPet);




    }
}
