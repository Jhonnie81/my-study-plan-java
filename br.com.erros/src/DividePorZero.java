package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;

        do {
        try {
             System.out.println("Numero");
             int a = s.nextInt();
             System.out.println("Divisor : ");
             int b = s.nextInt();

        System.out.println(a / b);
       }
       catch (InputMismatchException e1) {
           System.out.println("Favor inserir números inteiros");
           s.nextLine();//descarta entrada inválida
       }
       catch (Throwable e2) {
           System.out.println("O divisor deve ser diferente de zero");
       }
        finally {
            System.out.println("Finally executando...");
        }
        }while (continuar);
    }
}
