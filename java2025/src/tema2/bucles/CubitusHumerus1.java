package tema2.bucles;

public class CubitusHumerus1 {

    public static void main(String[] args) {
        //Dos romanos asediando una ciudad, están aburridos y se ponen a jugar a los dados
        //Cada uno tira un dado de 20 caras
        //Gana el saca el dado mayor, o si alguno de ellos saca el 9
        //Juega una partida y dime quién gana
        //Si juegan 10 partidas dime quién gana de los dos (el que gana más partidas)

        //1. Saca 9 Humurus y Cubitus != 9 -> Gana H
        //2. Saca 9 Cubitus y Humerus != 9 -> Gana C
        //3. Sacan 9 los dos -> Empate
        //4.1 Sacan != 9 los dos y Humerus > Cubitus -> Gana H
        //4.2 Sacan != 9 los dos y Cubitus > Humerus -> Gana C
        //4.3 Sacan != 9 los dos y Cubitus == Humerus -> Empate

        int tiradaH;
        int tiradaC;

        int contadorGanaC=0;
        int contadorGanaH=0;
        for(int i=0; i < 10; i++) {
            tiradaH = (int) (Math.random() * 20) + 1;
            tiradaC = (int) (Math.random() * 20) + 1;
            System.out.println("TiradaH " + tiradaH);
            System.out.println("TiradaC " + tiradaC);

            if ((tiradaH == 9) && (tiradaC != 9)) {
                System.out.println("Gana Humerus");
                contadorGanaH++;
            } else if ((tiradaC == 9) && (tiradaH != 9)) {
                System.out.println("Gana Cubitus");
                contadorGanaC++;
            } else if ((tiradaC == 9) && (tiradaH == 9)) {
                System.out.println("Empate");
            } else if (tiradaC > tiradaH) {
                System.out.println("Gana Cubitus");
                contadorGanaC++;
            } else if (tiradaH > tiradaC) {
                System.out.println("Gana Humerus");
                contadorGanaH++;
            } else if (tiradaC == tiradaH) {
                System.out.println("Empate");
            }
        }

        System.out.println("Partidas Cubitus " + contadorGanaC);
        System.out.println("Partidas Humerus " + contadorGanaH);

        if (contadorGanaC > contadorGanaH) {
            System.out.println("Ganador total Cubitus");
        } else if (contadorGanaH > contadorGanaC) {
            System.out.println("Ganador total Humerus");
        } else {
            System.out.println("Empatan y se toman unas cervezas");
        }









    }
}
