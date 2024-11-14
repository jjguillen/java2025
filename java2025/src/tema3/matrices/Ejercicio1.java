package tema3.matrices;

public class Ejercicio1 {

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) + min);
    }


    public static void main(String[] args) {

        //Ej1 - Crea un matriz 6x6 de enteros. Rellénala de valores aleatorios y
        //      dime la suma de la diagonal principal y de la diagonal secundaria

        int numeros[][] = new int[6][6];

        int sumaDPr=0, sumaDSc=0;

        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[0].length; j++) {
                numeros[i][j] = numero_aleatorio(1,9);
            }
        }

        pintar(numeros);

        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[0].length; j++) {
                if (i == j)
                    sumaDPr += numeros[i][j];

                if (i+j == numeros.length-1)
                    sumaDSc += numeros[i][j];
            }
        }

        System.out.println("Diagonal principal = " + sumaDPr);
        System.out.println("Diagonal secundaria = " + sumaDSc);



    }
}
