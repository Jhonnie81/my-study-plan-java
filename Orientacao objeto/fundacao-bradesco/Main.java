public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(5.0);
        retangulo.setAltura(3.0);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
