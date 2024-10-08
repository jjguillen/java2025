package tema1.ejercicios;

import java.time.Month;

public class Ejercicio17Practica {

    public static void main(String[] args) {

        //Generar números entre max y min -> (int) (Math.random() * (max - min + 1) + min) ;

        int apartadoA = (int) (Math.random() * (49 - 1 + 1) + 1) ;
        System.out.println(apartadoA);

        double apartadoC = Math.random() * 10 + 1; // * (10 - 1 + 1) + 1
        System.out.println(apartadoC);

        int apartadoE = (int) (Math.random() * (100 - (-100) + 1) + (-100)) ;
        System.out.println(apartadoE);

        int apartadoF = (int) (Math.random() * (5 - 1 + 1) + 1) ;
        System.out.println(apartadoF);

        int apartadoG = (int) (Math.random() * (12 - 1 + 1) + 1) ;
        System.out.println(Month.of(apartadoG));



    }
}
