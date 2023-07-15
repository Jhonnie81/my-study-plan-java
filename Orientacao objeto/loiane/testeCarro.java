public class testeCarro {
    public static void main(String[] args) {

        carro suv = new carro();

        suv.marca = "Honda";
        suv.modelo = "Hrv";
        suv.passageiros = 5;
        suv.capcombustivel = 70;
        suv.consumolt = 8.5;

        System.out.println(suv.marca);
        System.out.println(suv.modelo);

        carro popular = new carro();

        popular.marca = "Palio";
        popular.modelo = "Fiat";
        popular.passageiros = 5;
        popular.capcombustivel = 50;
        popular.consumolt = 13.5;



        System.out.println(popular.marca);
        System.out.println(popular.modelo);
    }
}
