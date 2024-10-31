package tema2.CubitusHumerusGrupos;

import java.util.Scanner;

public class Ejercicio1 {

    /*Marcus Cubitus y Julius Humerus son dos legionarios muy aficionados a los juegos de
dados y que aparecen a menudo en estos exámenes.
Esta vez juegan a un juego en el que primero se decide cuántos turnos se van a jugar. En cada turno,
cada jugador tira un dado.
Si un jugador saca un valor mayor que el otro, gana los puntos de ambos
dados. Si los dos jugadores sacan el mismo valor, los puntos de ambos dados se
acumulan para el siguiente turno. Si en el último turno hay un empate, esos puntos se
pierden, porque la partida termina. Escriba un programa que muestre una partida de
este juego, detallando quién gana la partida, quién gana cada turno y la puntuación
acumulada por cada jugador tras cada turno*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int turno;
        int acumuladorC = 0 ,acumuladorH = 0;
        int tiradaH , tiradaC;
        int totalC = 0 , totalH = 0;
        int empat = 0 ;


        System.out.println("Cuantos turnos quieres jugar:");
        turno = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= turno ; i++) {

            tiradaC = numero_aleatorio(1,6);
            System.out.println("Cubitos: " + tiradaC);
            tiradaH = numero_aleatorio(1,6);
            System.out.println("Humerus: " + tiradaH );

            if (tiradaH == tiradaC){
                empat += (2*tiradaC); //Sumar empates consecutivos
                System.out.println("Empate");
            }

            if (tiradaC > tiradaH){
                acumuladorC = tiradaC + tiradaH + empat;
                empat = 0; //Una vez que he sumado un empate, reinicio
                System.out.println("Turno " + i + " gana CUBITUS.");
                System.out.println("Acumulador C: " + acumuladorC);
                totalC += acumuladorC;
            }

            if (tiradaH > tiradaC) {
                acumuladorH = tiradaC + tiradaH + empat;
                empat = 0;
                System.out.println("Turno " + i + " gana HUMERUS.");
                System.out.println("Acumulador H: " + acumuladorH);
                totalH += acumuladorH;
            }

        }

        System.out.println("Total de cubitos: " + totalC);
        System.out.println("Total de humerus: " + totalH);

        System.out.println("________________________________________");

        if (totalH > totalC) {
            System.out.println("Ha ganado HUMERUS En la partida");
        } else if (totalC > totalH) {
            System.out.println("Ha ganado CUBITUS En la partida");
        }else {
            System.out.println("Empate");
        }


    }






}
