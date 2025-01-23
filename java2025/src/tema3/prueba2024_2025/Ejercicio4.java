package tema3.prueba2024_2025;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Generar número aleatorio entre dos números
     * @param mayor
     * @param menor
     * @return
     */
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void rellenar(char lab[][]) {
        //Lo de dentro
        for (int i = 0; i <= lab.length - 1; i++) {
            for (int j = 0; j <= lab[i].length - 1; j++) {
                lab[i][j] = '-';
            }
        }
    }

    /**
     * Pinta la matriz
     * @param lab
     */
    public static void pintar(char lab[][]) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print(lab[i][j]);
            }
            System.out.println();


        }
    }

    /**
     * Distancia Manhattan entre dos puntos (x1,y1) y (x2,y2)
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static int calcularDistancia(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {

        char laberinto[][] = new char[10][10];
        int posXTesoro, posYTesoro;
        int posXJug=0, posYJug=0;
        int intentos=15, cont=0;
        int distanciaActual;
        int distanciaAnterior;

        Scanner sc = new Scanner(System.in);

        //Aquí estará la bomba
        posXTesoro = generarNumeroAleatorio(laberinto.length-1, 0);
        posYTesoro = generarNumeroAleatorio(laberinto.length-1, 0);

        distanciaAnterior = calcularDistancia(0,0, posXTesoro, posYTesoro);

        System.out.println("La bomba está en " + posXTesoro + " " + posYTesoro);

        rellenar(laberinto);
        pintar(laberinto);

        while(cont < intentos) {
            intentos++;

            try {
                System.out.println("Dime posición X jugador");
                posXJug = Integer.parseInt(sc.nextLine());
                System.out.println("Dime posición Y jugador");
                posYJug = Integer.parseInt(sc.nextLine());

                laberinto[posXJug][posYJug] = 'X';
            } catch (Exception e) {
                System.out.println("Error en las posiciones indicadas");
                continue; //Que siga el bucle
            }

            //Si aciertas que se vea el tesoro como un caracter especial
            if (posXJug == posXTesoro && posYJug == posYTesoro) {
                laberinto[posXJug][posYJug] = '*';
            }

            pintar(laberinto);

            if (posXJug == posXTesoro && posYJug == posYTesoro) {
                System.out.println("Encontraste el tesoro!!!");
                break;
            } else {
                //Sigue buscando
                distanciaActual = calcularDistancia(posXJug,posYJug, posXTesoro, posYTesoro);
                if (distanciaActual <= distanciaAnterior) {
                    System.out.println("Estás más cerca");
                } else {
                    System.out.println("Estás más lejos");
                }

                //Ponemos la distancia de este turno como la anterior del siguiente
                distanciaAnterior = distanciaActual;
            }

        }
    }
}
