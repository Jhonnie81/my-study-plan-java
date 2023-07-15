import java.util.Scanner;

public class verficarIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 1;
        int idadeMaisnova = Integer.MAX_VALUE;
        String nomeMaisnova = "";


        for (int i = 1; i < 4; i++){
            System.out.println("Entre com um nome " + i + ": ");
            String nome = scan.nextLine();

            System.out.println("Entre com a idade de " + nome + ": ");
            int idade = scan.nextInt();
            scan.nextLine();//limpar o scanner e voltar pro inicio do code

            if (idade < idadeMaisnova){
                nomeMaisnova = nome;
                idadeMaisnova = idade;
            }
        }
        System.out.println(nomeMaisnova);
        System.out.println(idadeMaisnova);
    }
}
