import java.util.Scanner;

public class Exercicio13Aula13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sind = (salarioBruto / 100) * 5;
        double ImpRen = (salarioBruto / 100) * 11;
        double TotDescontos = inss + sind + ImpRen;
        double salarioLiq = salarioBruto - TotDescontos;



        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Pagamento ao Inss: " + inss);
        System.out.println("Pagamento ao sindicato: " + sind);
        System.out.println("Pagamento imposto de renda: " + ImpRen);
        System.out.println("Total de descontos: " + TotDescontos);
        System.out.println("Salario Liquido: " + salarioLiq);

    }
}
