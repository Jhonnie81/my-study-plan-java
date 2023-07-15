public class Bichos {
    public static void main(String[] args) {
        Animais b1 = new Animais();

        b1.nome = "Toto";
        b1.especie = "Cachorro";
        b1.idade = 8;
        b1.peso = 23.5;

        b1.imprimir();

        Animais b2 = new Animais();

        b2.nome = "Xandin";
        b2.especie = "Burro";
        b2.idade = 29;
        b2.peso = 75;

        b2.imprimir();
    }
}
