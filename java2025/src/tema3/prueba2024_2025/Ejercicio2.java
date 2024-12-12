package tema3.prueba2024_2025;

import java.util.Scanner;

public class Ejercicio2 {

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int vidaJ1 = 40, vidaJ2 = 40;
        int aux=0;
        int tiradaJ1, tiradaJ2;
        int numRondas=0;
        int numReglaMag=0;
        boolean escudoJ1=false, escudoJ2=false;

        Scanner sc = new Scanner(System.in);

        numRondas = generarNumeroAleatorio(15, 5);
        System.out.println("El número de rondas va a ser " + numRondas);
        System.out.println("Vida J1: " + vidaJ1 + " Vida J2: " + vidaJ2);

        for(int i=0; i < numRondas; i++) {
            //Parada
            sc.nextLine();

            //Tirada jugadores
            tiradaJ1 = generarNumeroAleatorio(6,1);
            tiradaJ2 = generarNumeroAleatorio(6,1);
            System.out.println("Tirada J1: " + tiradaJ1 + " Tirada J2: " + tiradaJ2);

            //Regla mágica
            numReglaMag = generarNumeroAleatorio(5,1);
            System.out.print("La regla de este turno va a ser: ");
            switch (numReglaMag) {
                case 1:
                    System.out.println("Dado de fuego");
                    if (tiradaJ1 < tiradaJ2) {
                        aux = tiradaJ2 - tiradaJ1;
                        if (!escudoJ1)
                            vidaJ1 -= aux;
                        else
                            escudoJ1 = false;
                    } else if (tiradaJ1 > tiradaJ2) {
                        aux = tiradaJ1 - tiradaJ2;
                        if (!escudoJ2)
                            vidaJ2 -= aux;
                        else
                            escudoJ2 = false;
                    }
                    break;
                case 2:
                    System.out.println("Dado de curación");
                    vidaJ1 += tiradaJ1;
                    vidaJ2 += tiradaJ2;
                    break;
                case 3:
                    System.out.println("Dado de robo");
                    if (tiradaJ1 < tiradaJ2) {
                        if (!escudoJ1) {
                            aux = tiradaJ2 / 2;
                            vidaJ1 -= aux;
                            vidaJ2 += aux;
                        } else
                            escudoJ1 = false;
                    } else if (tiradaJ1 > tiradaJ2) {
                        if (!escudoJ2) {
                            aux = tiradaJ1 / 2;
                            vidaJ2 -= aux;
                            vidaJ1 += aux;
                        } else
                            escudoJ2 = false;
                    }
                    break;
                case 4:
                    System.out.println("Dado de explosivo");
                    if (tiradaJ1 == 6 && tiradaJ2 == 6) {
                        System.out.println("Uff, os libráis de la bomba, los dos 6");
                    } else if (tiradaJ1 == 6) {
                        if (!escudoJ2)
                            vidaJ2 -= 10;
                        else
                            escudoJ2 = false;
                    } else if (tiradaJ2 == 6) {
                        if (!escudoJ1)
                            vidaJ1 -= 10;
                        else
                            escudoJ1 = false;
                    }
                    break;
                case 5:
                    System.out.println("Dado de escudo");
                    if (tiradaJ1 < tiradaJ2) {
                        escudoJ1 = true;
                    } else if (tiradaJ1 > tiradaJ2) {
                        escudoJ2 = true;
                    }
                    break;
            }

            System.out.println("Vida J1: " + vidaJ1 + " Vida J2: " + vidaJ2);
            System.out.println("Escudo J1: " + escudoJ1 + " Escudo J2: " + escudoJ2);

            //Si alguno llega a 0 se acaba la partida
            if (vidaJ1 <= 0 || vidaJ2 <= 0) {
                break;
            }
        }

        //Calcular ganador
        if (vidaJ1 <= 0) {
            System.out.println("Ganador J2");
        } else if (vidaJ2 <= 0) {
            System.out.println("Ganador J1");
        } else if (vidaJ1 > vidaJ2) {
            System.out.println("Ganador J1");
        } else if (vidaJ2 > vidaJ1) {
            System.out.println("Ganador J2");
        } else {
            System.out.println("Empate???");
        }

    }
}
