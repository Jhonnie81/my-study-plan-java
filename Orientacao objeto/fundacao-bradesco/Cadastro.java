import java.util.Scanner;

public class Cadastro {
    Scanner scan = new Scanner(System.in);
    String nome;
    String sobrenome;
    int matricula;
    int idade;

    void imprimir (){
        System.out.println("Entre com um nome: ");
        nome = scan.nextLine();
        System.out.println("Entre com um sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.println("Entre com sua matrícula: ");
        matricula = scan.nextInt();
        System.out.println("Entre com sua idade: ");
        idade = scan.nextInt();
    }
    void resultado (){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade);
    }
}
