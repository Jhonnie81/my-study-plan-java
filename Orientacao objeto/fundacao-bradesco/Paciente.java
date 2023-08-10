import java.util.Scanner;

public class Paciente {
    String nome;
    double peso;
    double altura;

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    public double calculoIMC (){
        return peso / (altura * altura);
    }
}
