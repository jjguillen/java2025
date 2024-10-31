package tema2.CubitusHumerusGrupos;

import java.util.Scanner;

public class Ejercicio4 {

    public static int tirada(){
        tirada: return (int)(Math.random()*13)+1;
    }

    /**
     * Devuelve true si alguno de los tres primeros números coincide con alguno
     * de los otros tres. En caso de no coincidir devuelve false
     * @param dC1
     * @param dC2
     * @param dC3
     * @param dH1
     * @param dH2
     * @param dH3
     * @return
     */
    public static boolean comprobar(int dC1, int dC2, int dC3, int dH1, int dH2, int dH3) {
        if (dC1 == dH1 || dC1 == dH2 || dC1 == dH3)
            return true;
        if (dC2 == dH1 || dC2 == dH2 || dC2 == dH3)
            return true;
        if (dC3 == dH1 || dC3 == dH2 || dC3 == dH3)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int turno = 0;
        int dado1C, dado2C, dado3C, dado1H, dado2H, dado3H;
        boolean coinciden = false;
        int contadorC=0, contadorH=0;

        Scanner sc = new Scanner(System.in);

        while ( (turno < 1) || (turno % 2 == 0)) {
            try {
                System.out.println("Cuantos turnos se va a jugar (impar)");
                turno = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("No has introducido un valor valido");
            }
        }

        for(int i=0; i < turno; i++) {
            //Cada jugador lanza tres dados
            dado1C = tirada();
            dado2C = tirada();
            dado3C = tirada();
            dado1H = tirada();
            dado2H = tirada();
            dado3H = tirada();

            //System.out.println("Cubitus " + dado1C + " - " + dado2C + " - " + dado3C);
            //System.out.println("Humerus " + dado1H + " - " + dado2H + " - " + dado3H);

            //Comprobar que los tres de uno no coincidan con alguno de los tres del otro
            coinciden = comprobar(dado1C, dado2C, dado3C, dado1H, dado2H, dado3H);

            if (coinciden) {
                //System.out.println("Gana Cubitus");
                contadorC++;
            } else {
                //System.out.println("Gana Humerus");
                contadorH++;
            }

        }

        if (contadorC > contadorH)
            System.out.println("Gana Cubitus " + contadorC + " - " + contadorH);
        else
            System.out.println("Gana Humerus " + contadorC + " - " + contadorH);
    }
}
