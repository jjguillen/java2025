package tema1.ejercicios;

public class Ejercicio14Hoja {
    public static void main(String[] args) {

        //Generar un número aleatorio
        int tirada;

        //Generar números entre max y min -> (int) (Math.random() * (max - min + 1) + min) ;
        tirada = (int) (Math.random() * (6 - 1 + 1) + 1) ;

        System.out.println(tirada);
    }
}
