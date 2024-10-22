package tema2.bucles;

public class TablaMultiplicar {

    public static void main(String[] args) {

        //Imprimir tabla de multiplicar del 9
        for(int i = 1; i <= 10; i++) {
            System.out.println("9x" + i + " = " + (9 * i));
        }

        //Imprimir todas las tablas de multiplicar del 1 al 20, menos la del 10
        for(int i = 1; i <= 20; i++) {
            if (i != 10) {
                //Una tabla de multiplicar
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + "x" + j + " = " + (i * j));
                }
            }
        }



    }
}
