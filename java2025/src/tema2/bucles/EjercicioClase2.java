package tema2.bucles;

public class EjercicioClase2 {
    public static void main(String[] args) {
        //Tenemos que pintar la siguiente figura
        // 10000000
        // 01000000
        // 00100000
        // 00010000
        // 00001000
        // 00000100
        // 00000010
        // 00000001
        // El uno aparece cuando la fila y la columna coinciden

        //Un for dentro de otro for
        //El for con i lleva las filas
        //El for con j lleva las columnas

        for(int i=0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //Cuando la fila y la columna coincidan pinto 1
                if (i == j) {
                    System.out.print(1);
                } else {
                    //Sino pinto 0
                    System.out.print(0);
                }
            }
            System.out.println();
        }



    }
}
