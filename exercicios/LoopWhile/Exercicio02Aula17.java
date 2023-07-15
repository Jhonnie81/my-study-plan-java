import java.util.Scanner;

public class Exercicio02Aula17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValidas = false;

        do {
            System.out.println("Digite nome de usuario: ");
            String nomeUser = scan.next();

            System.out.println("Digite sua senha: ");
            String senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                //infoValidas = false;
                System.out.println("Senha igual ao Usuario, digite novamnete. ");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuario validos. ");
            }
        } while (!infoValidas);
    }
}
