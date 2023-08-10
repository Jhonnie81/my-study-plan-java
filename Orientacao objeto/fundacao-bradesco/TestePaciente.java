import java.util.Scanner;

public class TestePaciente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("Entre com o nome: ");
        paciente.nome = scan.nextLine();
        System.out.println("Entre com seu peso: ");
        paciente.peso = scan.nextDouble();
        System.out.println("Entre com sua altura: ");
        paciente.altura = scan.nextDouble();

        System.out.println("Nome: " + paciente.nome);
        System.out.println("Peso: " + paciente.getPeso());
        System.out.println("Altura: " + paciente.getAltura());

        System.out.println("IMC: " + paciente.calculoIMC());
    }
}
