package tema1.ejercicios;

import java.util.Scanner;

public class EjercicioClase1 {

    public static void main(String[] args) {

        double nota1=4, nota2=6, nota3=7;
        double notaMediaClase;
        double notaExamenFinal=8;
        double notaTrabajoFinal=9;

        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota1 ");
        nota1 = sc.nextDouble();
        System.out.println("Dime la nota2 ");
        nota2 = sc.nextDouble();
        System.out.println("Dime la nota3 ");
        nota3 = sc.nextDouble();

        notaMediaClase = (nota1 + nota2 + nota3) / 3;

        System.out.println("Dime la nota del examen final ");
        notaExamenFinal = sc.nextDouble();
        System.out.println("Dime la nota del trabajo final ");
        notaTrabajoFinal = sc.nextDouble();

        notaFinal = (notaMediaClase * 0.55) + (notaExamenFinal * 0.3) + (notaTrabajoFinal * 0.15);

        System.out.println("La nota final del alumno es: " + notaFinal);


    }
}
