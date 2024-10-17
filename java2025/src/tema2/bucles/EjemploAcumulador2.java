package tema2.bucles;

public class EjemploAcumulador2 {
    public static void main(String[] args) {

        //Genera 100 números aleatorios entre 1 y 100
        //Muestra la suma de los pares y la suma de los impares
        int totalPares = 0, totalImpares = 0;
        int numero;

        for(int i=0; i < 10000; i++) {
            numero = (int) (Math.random() * 100) + 1;
            if (numero % 2 == 0) {
                totalPares = totalPares + numero;
            } else {
                totalImpares = totalImpares + numero;
            }
        }

        System.out.println("Total pares: " + totalPares);
        System.out.println("Total impares: " + totalImpares);

    }
}
