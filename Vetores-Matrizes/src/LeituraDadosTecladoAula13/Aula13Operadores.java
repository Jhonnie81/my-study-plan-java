public class Aula13Operadores {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Está é";
        String segundoNome = " uma String contatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
    }
}
