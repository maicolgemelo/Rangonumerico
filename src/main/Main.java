package main;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int calculo;
        int resto;
        int invertido = 0;

        System.out.println("Ingrese un numero entre 0 y 9.999:");
        int numero = teclado.nextInt();


        while(numero > 0 && numero <= 9999){

            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;

        }

        System.out.println("el numero es " + invertido);


    }
}
