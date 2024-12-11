package tema3;

import java.util.Scanner;

public class Laberinto_IA {

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("?");
        }
    }

    /**
     * Generar número aleatorio entre dos números
     * @param mayor
     * @param menor
     * @return
     */
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    /**
     * Pinta el laberinto generado
     * @param lab
     */
    public static void pintar(char lab[][]) {
        /*
        try {
            Thread.sleep(250);  // Pausa de 2 segundos para mostrar el mensaje anterior.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        limpiarPantalla();
        */
        for(int i=0; i<lab.length; i++) {
            for(int j=0; j<lab[i].length; j++) {
                System.out.print(lab[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Completa el tablero del laberinto.
     * La parte de dentro son .
     * Los bordes inferior y superior son -
     * Los bordes derecho e izquierdo son |
     * @param lab
     */
    public static void rellenar(char lab[][]) {
        //Lo de dentro
        for(int i=1; i<lab.length-1; i++) {
            for(int j=1; j<lab[i].length-1; j++) {
                lab[i][j] = '.';
            }
        }

        //Borde superior e inferior
        for(int j=0; j < lab[0].length; j++) {
            lab[0][j] = '-';
            lab[lab.length-1][j] = '-';
        }

        //Borde derecho e izquierdo
        for(int i=0; i<lab.length; i++) {
            lab[i][0] = '|';
            lab[i][lab.length - 1] = '|';
        }
    }

    /**
     * Calcula de forma aleatoria donde poner la salida, en qué x e y
     * Devuelve un array con dos posiciones, la primera es la coordenada x y la segunda la y
     * @param lab
     * @return salida[0] -> coordx, salida[1] -> coordy
     */
    public static int[] generarSalida(char lab[][]) {
        //Generar un número aleatorio entre 1 y 4
        //1 -> superior, 2 -> borde inferior, 3 -> borde derecho, 4 -> borde izquierdo
        //Generar un número entre 0 y 20

        int salida[] = new int[2];

        int posicion = generarNumeroAleatorio(20,0);
        int borde = generarNumeroAleatorio(4,1);
        switch (borde) {
            case 1:
                //Fila superior x=0, y=posicion
                lab[0][posicion] = '#';
                salida[0] = 0;
                salida[1] = posicion;
                break;
            case 2:
                //Fila inferior x=numFilas, y=posicion
                lab[lab.length-1][posicion] = '#';
                salida[0] = lab.length-1;
                salida[1] = posicion;
                break;
            case 3:
                //Columna derecha x=posicion, y=numColumnas
                lab[posicion][lab[0].length-1] = '#';
                salida[0] = posicion;
                salida[1] = lab[0].length-1;
                break;
            case 4:
                //Columna izquierda x=posicion, y=0
                lab[posicion][0] = '#';
                salida[0] = posicion;
                salida[1] = 0;
                break;
        }
        return salida;
    }

    /**
     * Calcula la mejor dirección para llegar a la salida
     * @param salida
     * @return
     */
    public static int caminoMasCorto(int salida[], int posXJug, int posYJug) {
        int distancia = 0;
        int distanciaMenor = 1000;
        int mejorDireccion = 1;

        for(int i=1; i <= 4; i++) {
            switch (i) {
                case 1:
                    //Derecha
                    posYJug++;
                    break;
                case 2:
                    //Izquierda
                    posYJug--;
                    break;
                case 3:
                    //Abajo
                    posXJug++;
                    break;
                case 4:
                    //Arriba
                    posXJug--;
                    break;
            }
            if (posXJug >= 0 && posXJug <= 19 && posYJug >= 0 && posYJug <= 19) {
                distancia = Math.abs(posXJug - salida[0]) + Math.abs(posYJug - salida[1]);
                if (distancia < distanciaMenor) {
                    distanciaMenor = distancia;
                    mejorDireccion = i;
                }
            }

        }

        System.out.println(distanciaMenor);
        return mejorDireccion;
    }


    public static void main(String[] args) {
        char laberinto[][] = new char[20][20];
        int posXBomba, posYBomba;
        int posXJug=0, posYJug=0;

        Scanner sc = new Scanner(System.in);

        //Aquí estará la bomba
        posXBomba = generarNumeroAleatorio(18,1);
        posYBomba = generarNumeroAleatorio(18,1);

        //Rellenamos el laberinto
        rellenar(laberinto);
        //Jugador
        laberinto[0][0] = '@';

        //Generamos donde está la salida del laberinto
        int coordSalida[] = generarSalida(laberinto);

        //Nos movemos hasta encontrar la salida o explotar
        int direccion;
        boolean salida=false;
        boolean bomba=false;
        boolean fuera=false;

        while(!bomba && !salida && !fuera) {
            //Pintar laberinto
            rellenar(laberinto);
            laberinto[posXJug][posYJug] = '@';
            laberinto[coordSalida[0]][coordSalida[1]] = '#';
            pintar(laberinto);

            //Mover jugador
            //try - catch para detectar que no se sale del laberinto
            try {
                direccion = caminoMasCorto(coordSalida, posXJug, posYJug);
                if (direccion > 0 && direccion < 5) {
                    switch (direccion) {
                        case 1:
                            //Derecha
                            posYJug++;
                            break;
                        case 2:
                            //Izquierda
                            posYJug--;
                            break;
                        case 3:
                            //Abajo
                            posXJug++;
                            break;
                        case 4:
                            //Arriba
                            posXJug--;
                            break;
                    }
                    //Comprobamos salida
                    if (laberinto[posXJug][posYJug] == '#') {
                        salida = true;
                    }
                    //Comprobamos bomba
                    if (posXJug == posXBomba && posYJug == posYBomba) {
                        bomba = true;
                    }
                    //Movemos al jugador
                    laberinto[posXJug][posYJug] = '@';
                } else {
                    System.out.println("Dirección incorrecta");
                }
            } catch (IndexOutOfBoundsException ex) {
                fuera = true;
            }

        }

        //Comprobamos si ha salido o explotado
        if (salida) {
            System.out.println("Enhorabuena, has salido");
            System.out.println("La bomba estaba en (" + posXBomba + ", " + posYBomba + ")");
        } else if (bomba) {
            System.out.println("Lo siento, explotaste!!!");
        } else if (fuera) {
            System.out.println("Te saliste del laberinto, hay que ser ...");
        }

    }
}
