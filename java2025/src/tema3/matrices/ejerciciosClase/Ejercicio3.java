package tema3.matrices.ejerciciosClase;

public class Ejercicio3 {
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
        3. Simulación de contaminación
Tenemos una ciudad dividida en cuadrantes, una matriz NxM, decide tú.
Cada celda contiene un número entre 0 y 100 indicando el nivel de contaminación.
Pinta una nueva matriz, marcando con un 0 las zonas con contaminación menor a un umbral,
p. ej. 10, con un 1 las zonas entre 10 y 80, y con un 2 las zonas con más de 80.
Dime las coordenadas (i,j) de las zonas con más de 80 de contaminación
Dime también el nivel de contaminación promedio de la ciudad
         */

        int ciudad[][] = new int[10][10];
        int ciudadCont[][] = new int[10][10];

        for(int i=0; i < ciudad.length; i++) {
            for(int j=0; j< ciudad[0].length; j++) {
                ciudad[i][j] = generarNumeroAleatorio(100, 0);
            }
        }

        pintar(ciudad);

        int contadorZonasPeligro = 0;
        for(int i=0; i < ciudad.length; i++) {
            for(int j=0; j< ciudad[0].length; j++) {

                if (ciudad[i][j] <= 10) {
                    ciudadCont[i][j] = 0;
                } else if (ciudad[i][j] > 10 && ciudad[i][j] < 80) {
                    ciudadCont[i][j] = 1;
                } else if (ciudad[i][j] >= 80) {
                    ciudadCont[i][j] = 2;
                    contadorZonasPeligro++; //Cuántas zonas con 2 hay, para tamaño vector
                }
            }
        }

        pintar(ciudadCont);


        int zonas[][] = new int[contadorZonasPeligro][2]; // 1,2  2,5  5,4

        int cont=0; //Contador para ir guardando las coordenadas
        for(int i=0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                if (ciudadCont[i][j] == 2) {
                    zonas[cont][0] = i;
                    zonas[cont][1] = j;
                    cont++;
                    //System.out.println("Zona peligrosa: (" + i + ", " + j + ")" );
                }
            }
        }

        //pintar(zonas);

        zonas = obtenerZonasPeligro(ciudadCont, contadorZonasPeligro);
        pintar(zonas);
    }

    public static int[][] obtenerZonasPeligro(int zonas[][], int size) {
        int coord[][] = new int[size][2];

        int cont=0; //Contador para ir guardando las coordenadas
        for(int i=0; i < zonas.length; i++) {
            for (int j = 0; j < zonas[0].length; j++) {
                if (zonas[i][j] == 2) {
                    coord[cont][0] = i;
                    coord[cont][1] = j;
                    cont++;
                }
            }
        }

        return coord;
    }


}
