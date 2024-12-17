package tema3.prueba2024_2025;

import java.util.Scanner;

public class Ejercicio2_V2 {

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void dadoFuego(int jug1[], int jug2[]) {
        int aux;
        if (jug1[0] < jug2[0]) {
            aux = jug2[0] - jug1[0];
            if (jug1[2] == 0) //No tiene escudo
                jug1[1] -= aux;
            else
                jug1[2] = 0; //Quito escudo
        } else if (jug1[0] > jug2[0]) {
            aux = jug1[0] - jug2[0];
            if (jug2[2] == 0)
                jug2[1] -= aux;
            else
                jug2[2] = 0;
        }
    }

    public static void dadoRobo(int jug1[], int jug2[]) {
        int aux;
        if (jug1[0] < jug2[0]) {
            if (jug1[2] == 0) { //No tiene escudo
                aux = jug2[0] / 2;
                jug1[1] -= aux;
                jug2[1] += aux;
            }  else
                jug1[2] = 0; //Quito escudo
        } else if (jug1[0] > jug2[0]) {
            if (jug2[2] == 0) {
                aux = jug1[0] / 2;
                jug2[1] -= aux;
                jug1[1] += aux;
            } else
                jug2[2] = 0;
        }
    }

    public static void dadoExplosivo(int jug1[], int jug2[]) {
        if (jug1[0] == 6 && jug2[0] == 6) {
            System.out.println("Uff, os libráis de la bomba, los dos 6");
        } else if (jug1[0] == 6) {
            if (jug2[2] == 0)
                jug2[1] -= 10;
            else
                jug2[2] = 0;
        } else if (jug2[0] == 6) {
            if (jug1[2] == 0)
                jug1[1] -= 10;
            else
                jug1[2] = 0;
        }
    }

    public static void main(String[] args) {

        int aux=0;
        int numRondas=0;
        int numReglaMag=0;
        boolean escudoJ1=false, escudoJ2=false;

        int jugador1[] = new int[3]; //0-> tirada, 1->vidaJ, 2->si tiene escudo
        int jugador2[] = new int[3];

        jugador1[1] = 40; //Vida
        jugador2[1] = 40;

        jugador1[2] = 0; //No escudo
        jugador2[2] = 0; //No escudo

        Scanner sc = new Scanner(System.in);

        numRondas = generarNumeroAleatorio(15, 5);
        System.out.println("El número de rondas va a ser " + numRondas);
        System.out.println("Vida J1: " + jugador1[1] + " Vida J2: " + jugador2[1]);

        for(int i=0; i < numRondas; i++) {
            //Parada
            sc.nextLine();

            //Tirada jugadores
            jugador1[0] = generarNumeroAleatorio(6,1);
            jugador2[0] = generarNumeroAleatorio(6,1);
            System.out.println("Tirada J1: " + jugador1[0] + " Tirada J2: " + jugador2[0]);

            //Regla mágica
            numReglaMag = generarNumeroAleatorio(5,1);
            System.out.print("La regla de este turno va a ser: ");
            switch (numReglaMag) {
                case 1:
                    System.out.println("Dado de fuego");
                    dadoFuego(jugador1, jugador2);
                    break;
                case 2:
                    System.out.println("Dado de curación");
                    jugador1[1] += jugador1[0];
                    jugador2[1] += jugador2[0];
                    break;
                case 3:
                    System.out.println("Dado de robo");
                    dadoRobo(jugador1, jugador2);
                    break;
                case 4:
                    System.out.println("Dado de explosivo");
                    dadoExplosivo(jugador1, jugador2);
                    break;
                case 5:
                    System.out.println("Dado de escudo");
                    if (jugador1[0] < jugador2[0]) {
                        jugador2[2] = 1;
                    } else if (jugador1[0] > jugador2[0]) {
                        jugador1[2] = 1;
                    }
                    break;
            }

            System.out.println("Vida J1: " + jugador1[1] + " Vida J2: " + jugador2[1]);
            System.out.println("Escudo J1: " + jugador1[2] + " Escudo J2: " + jugador2[2]);

            //Si alguno llega a 0 se acaba la partida
            if (jugador1[1] <= 0 || jugador2[1] <= 0) {
                break;
            }
        }

        //Calcular ganador
        if (jugador1[1] <= 0) {
            System.out.println("Ganador J2");
        } else if (jugador2[1] <= 0) {
            System.out.println("Ganador J1");
        } else if (jugador1[1] > jugador2[1]) {
            System.out.println("Ganador J1");
        } else if (jugador2[1] > jugador1[1]) {
            System.out.println("Ganador J2");
        } else {
            System.out.println("Empate???");
        }

    }
}
