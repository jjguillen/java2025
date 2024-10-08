package tema1.ejercicios;

public class Ejercicio15Practica {

    public static void main(String[] args) {

        //Tengo 2000€ banco
        //Interés a recibir: 2.75% anual  --> 2000 * 2.75 / 100 --> 2000 * 2.75 / 100 / 2 semestral
        //De esos intereses Hacienda se lleva el 18%

        //Cuánto dinero me generan esos 2000 € a los seis meses


        double dinero = 2000;
        double interesGenerado = 2000 * 2.75 / 100; //Interés anual
        interesGenerado = interesGenerado / 2; //Interés de seis meses * 6 / 12 --> / 2

        System.out.println("El banco me da de interés "  + interesGenerado);

        double retencionHacienda = interesGenerado * 18 / 100;

        System.out.println("Al restar la retención me queda " + (interesGenerado - retencionHacienda));


    }
}
