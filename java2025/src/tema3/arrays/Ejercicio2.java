package tema3.arrays;

public class Ejercicio2 {

    public static double generarNumeroAleatorio(int mayor, int menor) {
        return (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        //Genera de forma aleatoria un array de doubles con 3000 elementos
        //Los valores estarán entre -100 y 100
        //Pinta los valores
        //Pinta los valores al revés
        //Dime la media de todos los valores

        double numeros[] = new double[30];
        double media=0;

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(100, -100);
            media += numeros[i];
        }

        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("---------------------------------");

        for(int i=numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        System.out.println("Media es " + media/numeros.length);








    }
}
