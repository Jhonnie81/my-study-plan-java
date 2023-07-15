public class testeConta {
    public static void main(String[] args) {

        conta corrente = new conta();

        corrente.tipo = "Corrente";
        corrente.numero = 5624;
        corrente.especial = "Nao";
        corrente.saldo = 50500;
        corrente.limite = 71000;

        System.out.println(corrente.tipo);
        System.out.println(corrente.numero);
        System.out.println(corrente.especial);
        System.out.println(corrente.saldo);
        System.out.println(corrente.limite);
    }
}
