public class Principal {
    public static void main(String[] args) {
        Carros c1 = new Carros();

        c1.nome = "Gol";
        c1.potencia = 10;
        c1.velocidade = 110;

        c1.acelerar();
        c1.imprimir();

        Carros c2 = new Carros();

        c2.nome = "Palio";
        c2.potencia = 20;
        c2.velocidade = 120;

        c2.acelerar();
        c2.imprimir();

    }
}
