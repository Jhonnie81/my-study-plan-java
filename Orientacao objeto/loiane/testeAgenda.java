public class testeAgenda {
    public static void main(String[] args) {
        agenda contato = new agenda();

        contato.nome = "Jhonatan";
        contato.sobrenome = "Matos";
        contato.numero = 95301673;

        System.out.println("-------CONTATOS-------");
        System.out.println("");
        System.out.println("Nome: " + contato.nome);
        System.out.println("Sobrenome: " + contato.sobrenome);
        System.out.println("Numero: " + contato.numero);
    }
}
