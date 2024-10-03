package tema1.ejercicios;

import java.util.Scanner;

public class EjerciciosPracticarProgramacion {

    public static void main(String[] args) {
/*
        String nombre;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");

        nombre = sc.nextLine();

        System.out.println("HOla " + nombre);

    ///////////////////////////////////////

        double base = 7;
        double altura = 5;

        double perimetro = ((base + altura) * 2);
        double area = base * altura;
        System.out.println("El perímetro es " + perimetro);
        System.out.println("El área es " + area);

    //////////////////////////////////////

        double gradosF = 100;
        double gradosC = (gradosF - 32) * 5 / 9;
        System.out.println(gradosF + " grados farenheit equivale a " + gradosC + " celsius");

        int minutosT = 135;  // 2 horas y 15 minutos   1 hora <-> 60 minutos

        /////////////////////////////////
        int horas = minutosT / 60;
        int minutos = 125 % 60; //El resto de la división

        System.out.println(horas);
        System.out.println(minutos);

        /////////////////////////////////////
        int numero1 = 100, numero2 = 120;
        int distancia;

        distancia = Math.abs(numero1 - numero2);

        System.out.println(distancia);

 */

        int x1=3,y1=5;
        int x2=7,y2=10;

        double distancia = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2) );
        System.out.println("La distancia es " + distancia);
    }

}
